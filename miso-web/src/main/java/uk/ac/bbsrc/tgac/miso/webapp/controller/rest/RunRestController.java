/*
 * Copyright (c) 2012. The Genome Analysis Centre, Norwich, UK
 * MISO project contacts: Robert Davey, Mario Caccamo @ TGAC
 * *********************************************************************
 *
 * This file is part of MISO.
 *
 * MISO is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MISO is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MISO.  If not, see <http://www.gnu.org/licenses/>.
 *
 * *********************************************************************
 */

package uk.ac.bbsrc.tgac.miso.webapp.controller.rest;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response.Status;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import uk.ac.bbsrc.tgac.miso.core.data.Run;
import uk.ac.bbsrc.tgac.miso.core.data.SequencerPartitionContainer;
import uk.ac.bbsrc.tgac.miso.core.data.SequencerPoolPartition;
import uk.ac.bbsrc.tgac.miso.core.manager.RequestManager;
import uk.ac.bbsrc.tgac.miso.core.util.RunProcessingUtils;
import uk.ac.bbsrc.tgac.miso.core.util.jackson.ContainerRecursionAvoidanceMixin;
import uk.ac.bbsrc.tgac.miso.core.util.jackson.UserInfoMixin;
import uk.ac.bbsrc.tgac.miso.webapp.controller.rest.RestExceptionHandler.RestError;

import com.eaglegenomics.simlims.core.User;
import com.eaglegenomics.simlims.core.manager.SecurityManager;

/**
 * A controller to handle all REST requests for Runs
 * 
 * @author Rob Davey
 * @date 01-Sep-2011
 * @since 0.1.0
 */
@Controller
@RequestMapping("/rest/run")
@SessionAttributes("run")
public class RunRestController {
  protected static final Logger log = LoggerFactory.getLogger(RunRestController.class);
  @Autowired
  private com.eaglegenomics.simlims.core.manager.SecurityManager securityManager;
  @Autowired
  private RequestManager requestManager;

  public void setSecurityManager(SecurityManager securityManager) {
    this.securityManager = securityManager;
  }

  public void setRequestManager(RequestManager requestManager) {
    this.requestManager = requestManager;
  }

  @RequestMapping(value = "{runId}", method = RequestMethod.GET, produces="application/json")
  public @ResponseBody String getRunById(@PathVariable Long runId) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    Run r = requestManager.getRunById(runId);
    if (r == null) {
      throw new RestException("No run found with ID: " + runId, Status.NOT_FOUND);
    }
    mapper.getSerializationConfig().addMixInAnnotations(SequencerPartitionContainer.class, ContainerRecursionAvoidanceMixin.class);
    mapper.getSerializationConfig().addMixInAnnotations(User.class, UserInfoMixin.class);
    return mapper.writeValueAsString(r);
  }

  @RequestMapping(value = "/alias/{runAlias}", method = RequestMethod.GET, produces="application/json")
  public @ResponseBody String getRunByAlias(@PathVariable String runAlias) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    mapper.getSerializationConfig().addMixInAnnotations(SequencerPartitionContainer.class, ContainerRecursionAvoidanceMixin.class);
    mapper.getSerializationConfig().addMixInAnnotations(User.class, UserInfoMixin.class);
    Run r = requestManager.getRunByAlias(runAlias);
    if (r == null) {
      throw new RestException("No run found with alias: " + runAlias, Status.NOT_FOUND);
    }
    return mapper.writeValueAsString(r);
  }

  @RequestMapping(value = "{runAlias}/samplesheet", method = RequestMethod.GET)
  public @ResponseBody String getSampleSheetForRun(@PathVariable String runAlias) throws IOException {
    Run r = requestManager.getRunByAlias(runAlias);
    User user = securityManager.getUserByLoginName(SecurityContextHolder.getContext().getAuthentication().getName());
    if (r == null) {
      throw new RestException("No run found with alias: " + runAlias, Status.NOT_FOUND);
    }
    Collection<SequencerPartitionContainer<SequencerPoolPartition>> conts = r.getSequencerPartitionContainers();
    if (conts.isEmpty() || conts.size() != 1) {
      throw new RestException("Expected 1 partition container for run " + runAlias 
          + ", but found " + (conts == null ? 0 : conts.size()));
    }
    return RunProcessingUtils.buildIlluminaDemultiplexCSV(r, conts.iterator().next(), "1.8", user.getLoginName());
  }

  @RequestMapping(method = RequestMethod.GET, produces="application/json")
  public @ResponseBody String listAllRuns() throws IOException {
    Collection<Run> lr = requestManager.listAllRuns();
    ObjectMapper mapper = new ObjectMapper();
    mapper.getSerializationConfig().addMixInAnnotations(SequencerPartitionContainer.class, ContainerRecursionAvoidanceMixin.class);
    mapper.getSerializationConfig().addMixInAnnotations(User.class, UserInfoMixin.class);
    return mapper.writeValueAsString(lr);
  }
  
  @ExceptionHandler(Exception.class)
  public @ResponseBody RestError handleError(HttpServletRequest request, HttpServletResponse response, Exception exception) {
    return RestExceptionHandler.handleException(request, response, exception);
  }
  
}
