package uk.ac.bbsrc.tgac.miso.core.data;

import java.util.Date;

import com.eaglegenomics.simlims.core.User;

import uk.ac.bbsrc.tgac.miso.core.data.impl.kit.KitDescriptor;

public interface LibraryAdditionalInfo {

  Long getLibraryId();

  void setLibraryId(Long libraryid);

  Library getLibrary();

  void setLibrary(Library library);

  Long getGroupId();

  void setGroupId(Long groupId);

  String getGroupDescription();

  void setGroupDescription(String groupDescription);

  KitDescriptor getPrepKit();

  void setPrepKit(KitDescriptor prepKit);

  User getCreatedBy();

  void setCreatedBy(User createdBy);

  Date getCreationDate();

  void setCreationDate(Date creationDate);

  User getUpdatedBy();

  void setUpdatedBy(User updatedBy);

  Date getLastUpdated();

  void setLastUpdated(Date lastUpdated);

  Boolean getArchived();

  void setArchived(Boolean archived);

  LibraryDesign getLibraryDesign();

  void setLibraryDesign(LibraryDesign rule);

  /**
   * This method should ONLY be used for load/save coordination between the Hibernate and old SQL DAOs. For all other purposes, use
   * getPrepKit().getKitDescriptorId()
   * 
   * @return the Kit Descriptor ID loaded by/for Hibernate
   */
  Long getHibernateKitDescriptorId();

}
