package uk.ac.bbsrc.tgac.miso.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import com.google.common.collect.Sets;

import uk.ac.bbsrc.tgac.miso.core.data.Box;
import uk.ac.bbsrc.tgac.miso.core.data.Boxable;
import uk.ac.bbsrc.tgac.miso.core.data.Identity;
import uk.ac.bbsrc.tgac.miso.core.data.Institute;
import uk.ac.bbsrc.tgac.miso.core.data.Lab;
import uk.ac.bbsrc.tgac.miso.core.data.Library;
import uk.ac.bbsrc.tgac.miso.core.data.LibraryAdditionalInfo;
import uk.ac.bbsrc.tgac.miso.core.data.PoolOrder;
import uk.ac.bbsrc.tgac.miso.core.data.QcPassedDetail;
import uk.ac.bbsrc.tgac.miso.core.data.Sample;
import uk.ac.bbsrc.tgac.miso.core.data.SampleAdditionalInfo;
import uk.ac.bbsrc.tgac.miso.core.data.SampleAnalyte;
import uk.ac.bbsrc.tgac.miso.core.data.SampleClass;
import uk.ac.bbsrc.tgac.miso.core.data.SampleGroupId;
import uk.ac.bbsrc.tgac.miso.core.data.SampleNumberPerProject;
import uk.ac.bbsrc.tgac.miso.core.data.SamplePurpose;
import uk.ac.bbsrc.tgac.miso.core.data.SampleTissue;
import uk.ac.bbsrc.tgac.miso.core.data.SampleValidRelationship;
import uk.ac.bbsrc.tgac.miso.core.data.SequencingParameters;
import uk.ac.bbsrc.tgac.miso.core.data.Subproject;
import uk.ac.bbsrc.tgac.miso.core.data.TagBarcode;
import uk.ac.bbsrc.tgac.miso.core.data.TissueMaterial;
import uk.ac.bbsrc.tgac.miso.core.data.TissueOrigin;
import uk.ac.bbsrc.tgac.miso.core.data.TissueType;
import uk.ac.bbsrc.tgac.miso.core.data.impl.BoxImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.IdentityImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.InstituteImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.LabImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryAdditionalInfoImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.PoolOrderImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.ProjectImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.QcPassedDetailImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.SampleAdditionalInfoImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.SampleAnalyteImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.SampleClassImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.SampleGroupImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.SampleImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.SampleNumberPerProjectImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.SamplePurposeImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.SampleTissueImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.SampleValidRelationshipImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.SubprojectImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.TissueMaterialImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.TissueOriginImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.TissueTypeImpl;
import uk.ac.bbsrc.tgac.miso.core.data.impl.kit.KitDescriptor;
import uk.ac.bbsrc.tgac.miso.core.data.type.KitType;
import uk.ac.bbsrc.tgac.miso.core.data.type.PlatformType;
import uk.ac.bbsrc.tgac.miso.core.util.LimsUtils;

public class Dtos {

  private static DateTimeFormatter dateTimeFormatter = ISODateTimeFormat.dateTimeNoMillis();
  private static DateTimeFormatter dateFormatter = ISODateTimeFormat.date();

  public static TissueOriginDto asDto(TissueOrigin from) {
    TissueOriginDto dto = new TissueOriginDto();
    dto.setId(from.getId());
    dto.setAlias(from.getAlias());
    dto.setDescription(from.getDescription());
    dto.setCreatedById(from.getCreatedBy().getUserId());
    dto.setCreationDate(dateTimeFormatter.print(from.getCreationDate().getTime()));
    dto.setUpdatedById(from.getUpdatedBy().getUserId());
    dto.setLastUpdated(dateTimeFormatter.print(from.getLastUpdated().getTime()));
    return dto;
  }

  public static Set<TissueOriginDto> asTissueOriginDtos(Set<TissueOrigin> from) {
    Set<TissueOriginDto> dtoSet = Sets.newHashSet();
    for (TissueOrigin tissueOrigin : from) {
      dtoSet.add(asDto(tissueOrigin));
    }
    return dtoSet;
  }

  public static TissueOrigin to(TissueOriginDto from) {
    TissueOrigin to = new TissueOriginImpl();
    to.setId(from.getId());
    to.setAlias(from.getAlias());
    to.setDescription(from.getDescription());
    return to;
  }

  public static TissueTypeDto asDto(TissueType from) {
    TissueTypeDto dto = new TissueTypeDto();
    dto.setId(from.getId());
    dto.setAlias(from.getAlias());
    dto.setDescription(from.getDescription());
    dto.setCreatedById(from.getCreatedBy().getUserId());
    dto.setCreationDate(dateTimeFormatter.print(from.getCreationDate().getTime()));
    dto.setUpdatedById(from.getUpdatedBy().getUserId());
    dto.setLastUpdated(dateTimeFormatter.print(from.getLastUpdated().getTime()));
    return dto;
  }

  public static Set<TissueTypeDto> asTissueTypeDtos(Set<TissueType> from) {
    Set<TissueTypeDto> dtoSet = Sets.newHashSet();
    for (TissueType tissueType : from) {
      dtoSet.add(asDto(tissueType));
    }
    return dtoSet;
  }

  public static TissueType to(TissueTypeDto from) {
    TissueType to = new TissueTypeImpl();
    to.setId(from.getId());
    to.setAlias(from.getAlias());
    to.setDescription(from.getDescription());
    return to;
  }

  public static SubprojectDto asDto(Subproject from) {
    SubprojectDto dto = new SubprojectDto();
    dto.setId(from.getId());
    dto.setAlias(from.getAlias());
    dto.setDescription(from.getDescription());
    dto.setPriority(from.getPriority());
    dto.setParentProjectId(from.getParentProject().getProjectId());
    dto.setCreatedById(from.getCreatedBy().getUserId());
    dto.setCreationDate(dateTimeFormatter.print(from.getCreationDate().getTime()));
    dto.setUpdatedById(from.getUpdatedBy().getUserId());
    dto.setLastUpdated(dateTimeFormatter.print(from.getLastUpdated().getTime()));
    dto.setReferenceGenomeId(from.getReferenceGenomeId());
    return dto;
  }

  public static Set<SubprojectDto> asSubprojectDtos(Set<Subproject> from) {
    Set<SubprojectDto> dtoSet = Sets.newHashSet();
    for (Subproject subproject : from) {
      dtoSet.add(asDto(subproject));
    }
    return dtoSet;
  }

  public static Subproject to(SubprojectDto from) {
    Subproject to = new SubprojectImpl();
    to.setAlias(from.getAlias());
    to.setDescription(from.getDescription());
    to.setPriority(from.getPriority());
    to.setReferenceGenomeId(from.getReferenceGenomeId());
    return to;
  }

  public static SampleClassDto asDto(SampleClass from) {
    SampleClassDto dto = new SampleClassDto();
    dto.setId(from.getId());
    dto.setAlias(from.getAlias());
    dto.setSampleCategory(from.getSampleCategory());
    dto.setSuffix(from.getSuffix());
    dto.setStock(from.isStock());
    dto.setCreatedById(from.getCreatedBy().getUserId());
    dto.setCreationDate(dateTimeFormatter.print(from.getCreationDate().getTime()));
    dto.setUpdatedById(from.getUpdatedBy().getUserId());
    dto.setLastUpdated(dateTimeFormatter.print(from.getLastUpdated().getTime()));
    return dto;
  }

  public static Set<SampleClassDto> asSampleClassDtos(Set<SampleClass> from) {
    Set<SampleClassDto> dtoSet = Sets.newHashSet();
    for (SampleClass sampleClass : from) {
      dtoSet.add(asDto(sampleClass));
    }
    return dtoSet;
  }

  public static SampleClass to(SampleClassDto from) {
    SampleClass to = new SampleClassImpl();
    to.setAlias(from.getAlias());
    to.setSampleCategory(from.getSampleCategory());
    to.setSuffix(from.getSuffix());
    to.setStock(from.isStock());
    return to;
  }

  public static QcPassedDetailDto asDto(QcPassedDetail from) {
    QcPassedDetailDto dto = new QcPassedDetailDto();
    dto.setId(from.getId());
    dto.setStatus(from.getStatus());
    dto.setDescription(from.getDescription());
    dto.setNoteRequired(from.getNoteRequired());
    dto.setCreatedById(from.getCreatedBy().getUserId());
    dto.setCreationDate(dateTimeFormatter.print(from.getCreationDate().getTime()));
    dto.setUpdatedById(from.getUpdatedBy().getUserId());
    dto.setLastUpdated(dateTimeFormatter.print(from.getLastUpdated().getTime()));
    return dto;
  }

  public static Set<QcPassedDetailDto> asQcPassedDetailDtos(Set<QcPassedDetail> from) {
    Set<QcPassedDetailDto> dtoSet = Sets.newHashSet();
    for (QcPassedDetail qcPassedDetail : from) {
      dtoSet.add(asDto(qcPassedDetail));
    }
    return dtoSet;
  }

  public static QcPassedDetail to(QcPassedDetailDto from) {
    QcPassedDetail to = new QcPassedDetailImpl();
    to.setStatus(from.getStatus());
    to.setDescription(from.getDescription());
    to.setNoteRequired(from.isNoteRequired());
    return to;
  }

  public static SampleAdditionalInfoDto asDto(SampleAdditionalInfo from) {
    SampleAdditionalInfoDto dto = new SampleAdditionalInfoDto();
    dto.setSampleId(from.getId());
    dto.setSampleClassId(from.getSampleClass().getId());
    if (from.getLab() != null) {
      dto.setLabId(from.getLab().getId());
    }
    if (from.getTissueOrigin() != null) {
      dto.setTissueOriginId(from.getTissueOrigin().getId());
    }
    if (from.getTissueType() != null) {
      dto.setTissueTypeId(from.getTissueType().getId());
    }
    if (from.getQcPassedDetail() != null) {
      dto.setQcPassedDetailId(from.getQcPassedDetail().getId());
    }
    if (from.getSubproject() != null) {
      dto.setSubprojectId(from.getSubproject().getId());
    }
    if (from.getPrepKit() != null) {
      dto.setPrepKitId(from.getPrepKit().getId());
    }
    if (from.getParent() != null) {
      dto.setParentId(from.getParent().getId());
      dto.setParentAlias(from.getParent().getAlias());
      dto.setParentSampleClassId(from.getParent().getSampleAdditionalInfo().getSampleClass().getId());
    }
    dto.setPassageNumber(from.getPassageNumber());
    dto.setTimesReceived(from.getTimesReceived());
    dto.setConcentration(from.getConcentration());
    dto.setCreatedById(from.getCreatedBy().getUserId());
    dto.setCreationDate(dateTimeFormatter.print(from.getCreationDate().getTime()));
    dto.setUpdatedById(from.getUpdatedBy().getUserId());
    dto.setLastUpdated(dateTimeFormatter.print(from.getLastUpdated().getTime()));
    dto.setExternalInstituteIdentifier(from.getExternalInstituteIdentifier());
    dto.setTubeNumber(from.getTubeNumber());
    if (from.getParent() != null) {
      dto.setParentId(from.getParent().getId());
      dto.setParentAlias(from.getParent().getAlias());
      dto.setParentSampleClassId(from.getSampleClass().getId());
    }
    return dto;
  }

  public static Set<SampleAdditionalInfoDto> asSampleAdditionalInfoDtos(Set<SampleAdditionalInfo> from) {
    Set<SampleAdditionalInfoDto> dtoSet = Sets.newHashSet();
    for (SampleAdditionalInfo sampleAdditionalInfo : from) {
      dtoSet.add(asDto(sampleAdditionalInfo));
    }
    return dtoSet;
  }

  public static SampleAdditionalInfo to(SampleAdditionalInfoDto from) {
    SampleAdditionalInfo to = new SampleAdditionalInfoImpl();
    to.setId(from.getSampleId());
    to.setPassageNumber(from.getPassageNumber());
    to.setTimesReceived(from.getTimesReceived());
    to.setTubeNumber(from.getTubeNumber());
    to.setExternalInstituteIdentifier(from.getExternalInstituteIdentifier());
    to.setConcentration(from.getConcentration());
    if (from.getTissueOriginId() != null) {
      TissueOrigin tissueOrigin = new TissueOriginImpl();
      tissueOrigin.setId(from.getTissueOriginId());
      to.setTissueOrigin(tissueOrigin);
    }
    if (from.getTissueTypeId() != null) {
      TissueType tissueType = new TissueTypeImpl();
      tissueType.setId(from.getTissueTypeId());
      to.setTissueType(tissueType);
    }
    if (from.getQcPassedDetailId() != null) {
      QcPassedDetail qcpassedDetail = new QcPassedDetailImpl();
      qcpassedDetail.setId(from.getQcPassedDetailId());
      to.setQcPassedDetail(qcpassedDetail);
    }
    if (from.getSubprojectId() != null) {
      Subproject subproject = new SubprojectImpl();
      subproject.setId(from.getSubprojectId());
      to.setSubproject(subproject);
    }
    if (from.getPrepKitId() != null) {
      KitDescriptor prepKit = new KitDescriptor();
      prepKit.setId(from.getPrepKitId());
      to.setPrepKit(prepKit);
    }
    if (from.getSampleClassId() != null) {
      SampleClass sampleClass = new SampleClassImpl();
      sampleClass.setId(from.getSampleClassId());
      to.setSampleClass(sampleClass);
    }
    Sample parent = null;
    if (from.getParentId() != null) {
      parent = new SampleImpl();
      parent.setId(from.getParentId());
    }
    if (from.getParentAlias() != null) {
      if (parent == null) parent = new SampleImpl();
      parent.setAlias(from.getParentAlias());
    }
    if (from.getParentSampleClassId() != null) {
      if (parent == null) {
        parent = new SampleImpl();
        parent.setSampleAdditionalInfo(new SampleAdditionalInfoImpl());
        parent.getSampleAdditionalInfo().setSampleClass(new SampleClassImpl());
        parent.getSampleAdditionalInfo().getSampleClass().setId(from.getParentSampleClassId());
      }
    }
    if (parent != null) {
      to.setParent(parent);
    }
    return to;
  }

  public static TissueMaterialDto asDto(TissueMaterial from) {
    TissueMaterialDto dto = new TissueMaterialDto();
    dto.setId(from.getId());
    dto.setAlias(from.getAlias());
    dto.setDescription(from.getDescription());
    dto.setCreatedById(from.getCreatedBy().getUserId());
    dto.setCreationDate(dateTimeFormatter.print(from.getCreationDate().getTime()));
    dto.setUpdatedById(from.getUpdatedBy().getUserId());
    dto.setLastUpdated(dateTimeFormatter.print(from.getLastUpdated().getTime()));
    return dto;
  }

  public static Set<TissueMaterialDto> asTissueMaterialDtos(Set<TissueMaterial> from) {
    Set<TissueMaterialDto> dtoSet = Sets.newHashSet();
    for (TissueMaterial tissueMaterial : from) {
      dtoSet.add(asDto(tissueMaterial));
    }
    return dtoSet;
  }

  public static TissueMaterial to(TissueMaterialDto from) {
    TissueMaterial to = new TissueMaterialImpl();
    to.setAlias(from.getAlias());
    to.setDescription(from.getDescription());
    return to;
  }

  public static SamplePurposeDto asDto(SamplePurpose from) {
    SamplePurposeDto dto = new SamplePurposeDto();
    dto.setId(from.getId());
    dto.setAlias(from.getAlias());
    dto.setDescription(from.getDescription());
    dto.setCreatedById(from.getCreatedBy().getUserId());
    dto.setCreationDate(dateTimeFormatter.print(from.getCreationDate().getTime()));
    dto.setUpdatedById(from.getUpdatedBy().getUserId());
    dto.setLastUpdated(dateTimeFormatter.print(from.getLastUpdated().getTime()));
    return dto;
  }

  public static Set<SamplePurposeDto> asSamplePurposeDtos(Set<SamplePurpose> from) {
    Set<SamplePurposeDto> dtoSet = Sets.newHashSet();
    for (SamplePurpose samplePurpose : from) {
      dtoSet.add(asDto(samplePurpose));
    }
    return dtoSet;
  }

  public static SamplePurpose to(SamplePurposeDto from) {
    SamplePurpose to = new SamplePurposeImpl();
    to.setAlias(from.getAlias());
    to.setDescription(from.getDescription());
    return to;
  }

  public static SampleGroupDto asDto(SampleGroupId from) {
    SampleGroupDto dto = new SampleGroupDto();
    dto.setId(from.getId());
    dto.setGroupId(from.getGroupId());
    dto.setProjectId(from.getProject().getId());
    dto.setSubprojectId(from.getSubproject() == null ? null : from.getSubproject().getId());
    dto.setDescription(from.getDescription());
    dto.setCreatedById(from.getCreatedBy().getUserId());
    dto.setCreationDate(dateTimeFormatter.print(from.getCreationDate().getTime()));
    dto.setUpdatedById(from.getUpdatedBy().getUserId());
    dto.setLastUpdated(dateTimeFormatter.print(from.getLastUpdated().getTime()));
    return dto;
  }

  public static Set<SampleGroupDto> asSampleGroupDtos(Set<SampleGroupId> from) {
    Set<SampleGroupDto> dtoSet = Sets.newHashSet();
    for (SampleGroupId sampleGroup : from) {
      dtoSet.add(asDto(sampleGroup));
    }
    return dtoSet;
  }

  public static SampleGroupId to(SampleGroupDto from) {
    SampleGroupId to = new SampleGroupImpl();
    to.setGroupId(from.getGroupId());
    to.setDescription(from.getDescription());
    return to;
  }

  public static SampleAnalyteDto asDto(SampleAnalyte from) {
    SampleAnalyteDto dto = new SampleAnalyteDto();
    dto.setSampleId(from.getId());
    dto.setSampleId(from.getSample().getId());
    dto.setStrStatus(from.getStrStatus().getLabel());
    if (from.getSamplePurpose() != null) {
      dto.setSamplePurposeId(from.getSamplePurpose().getId());
    }
    dto.setGroupId(from.getGroupId());
    dto.setGroupDescription(from.getGroupDescription());
    if (from.getTissueMaterial() != null) {
      dto.setTissueMaterialId(from.getTissueMaterial().getId());
    }
    dto.setRegion(from.getRegion());
    dto.setTubeId(from.getTubeId());
    dto.setCreatedById(from.getCreatedBy().getUserId());
    dto.setCreationDate(dateTimeFormatter.print(from.getCreationDate().getTime()));
    dto.setUpdatedById(from.getUpdatedBy().getUserId());
    dto.setLastUpdated(dateTimeFormatter.print(from.getLastUpdated().getTime()));
    return dto;
  }

  public static Set<SampleAnalyteDto> asSampleAnalyteDtos(Set<SampleAnalyte> from) {
    Set<SampleAnalyteDto> dtoSet = Sets.newHashSet();
    for (SampleAnalyte sampleAnalyte : from) {
      dtoSet.add(asDto(sampleAnalyte));
    }
    return dtoSet;
  }

  public static SampleAnalyte to(SampleAnalyteDto from) {
    SampleAnalyte to = new SampleAnalyteImpl();
    to.setId(from.getSampleId());
    to.setRegion(from.getRegion());
    to.setTubeId(from.getTubeId());
    if (from.getGroupId() != null) {
      to.setGroupId(from.getGroupId());
      to.setGroupDescription(from.getGroupDescription());
    }
    if (from.getSamplePurposeId() != null) {
      to.setSamplePurpose(new SamplePurposeImpl());
      to.getSamplePurpose().setId(from.getSamplePurposeId());
    }
    if (from.getTissueMaterialId() != null) {
      to.setTissueMaterial(new TissueMaterialImpl());
      to.getTissueMaterial().setId(from.getTissueMaterialId());
    }
    if (from.getStrStatus() != null) {
      to.setStrStatus(from.getStrStatus());
    }
    return to;
  }

  public static SampleDto asDto(Sample from) {
    SampleDto dto = new SampleDto();
    dto.setId(from.getId());
    if (!LimsUtils.isStringEmptyOrNull(from.getAccession())) {
      dto.setAccession(from.getAccession());
    }
    dto.setName(from.getName());
    dto.setDescription(from.getDescription());
    if (!LimsUtils.isStringEmptyOrNull(from.getIdentificationBarcode())) {
      dto.setIdentificationBarcode(from.getIdentificationBarcode());
    }
    if (!LimsUtils.isStringEmptyOrNull(from.getLocationBarcode())) {
      dto.setLocationBarcode(from.getLocationBarcode());
    }
    dto.setSampleType(from.getSampleType());
    if (from.getReceivedDate() != null) {
      dto.setReceivedDate(dateTimeFormatter.print(from.getReceivedDate().getTime()));
    }
    if (from.getQcPassed() != null) {
      dto.setQcPassed(from.getQcPassed());
    }
    if (!LimsUtils.isStringEmptyOrNull(from.getAlias())) {
      dto.setAlias(from.getAlias());
    }
    dto.setProjectId(from.getProject().getProjectId());
    dto.setScientificName(from.getScientificName());
    if (!LimsUtils.isStringEmptyOrNull(from.getTaxonIdentifier())) {
      dto.setTaxonIdentifier(from.getTaxonIdentifier());
    }
    if (from.getIdentity() != null) {
      dto.setSampleIdentity(asDto(from.getIdentity()));
    }
    if (from.getSampleAnalyte() != null) {
      dto.setSampleAnalyte(asDto(from.getSampleAnalyte()));
    }
    if (from.getSampleAdditionalInfo() != null) {
      dto.setSampleAdditionalInfo(asDto(from.getSampleAdditionalInfo()));
    }
    if (from.getSampleTissue() != null) {
      dto.setSampleTissue(asDto(from.getSampleTissue()));
    }
    dto.setVolume(from.getVolume());
    dto.setEmpty(from.isEmpty());

    return dto;
  }

  public static Set<SampleDto> asSampleDtos(Set<Sample> from) {
    Set<SampleDto> dtoSet = Sets.newHashSet();
    for (Sample sample : from) {
      dtoSet.add(asDto(sample));
    }
    return dtoSet;
  }

  public static Sample to(SampleDto from) {
    Sample to = new SampleImpl();
    if (from.getId() != null) {
      to.setId(from.getId());
    }
    if (!LimsUtils.isStringEmptyOrNull(from.getAccession())) {
      to.setAccession(from.getAccession());
    }
    to.setName(from.getName());
    to.setDescription(from.getDescription());
    if (!LimsUtils.isStringEmptyOrNull(from.getIdentificationBarcode())) {
      to.setIdentificationBarcode(from.getIdentificationBarcode());
    }
    if (!LimsUtils.isStringEmptyOrNull(from.getLocationBarcode())) {
      to.setLocationBarcode(from.getLocationBarcode());
    }
    to.setSampleType(from.getSampleType());
    if (from.getReceivedDate() != null) {
      to.setReceivedDate(dateFormatter.parseDateTime(from.getReceivedDate()).toDate());
    }
    to.setQcPassed(from.getQcPassed());
    if (!LimsUtils.isStringEmptyOrNull(from.getAlias())) {
      to.setAlias(from.getAlias());
    }
    to.setScientificName(from.getScientificName());
    if (!LimsUtils.isStringEmptyOrNull(from.getTaxonIdentifier())) {
      to.setTaxonIdentifier(from.getTaxonIdentifier());
    }
    to.setAlias(from.getAlias());
    to.setDescription(from.getDescription());
    to.setVolume(from.getVolume());
    if (from.getEmpty() != null) to.setEmpty(from.getEmpty());
    if (from.getProjectId() != null) {
      to.setProject(new ProjectImpl());
      to.getProject().setProjectId(from.getProjectId());
    }
    if (from.getSampleAdditionalInfo() != null) {
      to.setSampleAdditionalInfo(to(from.getSampleAdditionalInfo()));
    }
    if (from.getSampleIdentity() != null) {
      to.setIdentity(to(from.getSampleIdentity()));
    }
    if (from.getSampleTissue() != null) {
      to.setSampleTissue(to(from.getSampleTissue()));
    }
    if (from.getSampleAnalyte() != null) {
      to.setSampleAnalyte(to(from.getSampleAnalyte()));
    }
    return to;
  }

  public static SampleIdentityDto asDto(Identity from) {
    SampleIdentityDto dto = new SampleIdentityDto();
    dto.setSampleId(from.getSampleId());
    dto.setInternalName(from.getInternalName());
    dto.setExternalName(from.getExternalName());
    dto.setDonorSex(from.getDonorSex().getLabel());
    dto.setCreatedById(from.getCreatedBy().getUserId());
    dto.setCreationDate(dateTimeFormatter.print(from.getCreationDate().getTime()));
    dto.setUpdatedById(from.getUpdatedBy().getUserId());
    dto.setLastUpdated(dateTimeFormatter.print(from.getLastUpdated().getTime()));
    return dto;
  }

  public static Set<SampleIdentityDto> asSampleIdentityDtos(Set<Identity> from) {
    Set<SampleIdentityDto> dtoSet = Sets.newHashSet();
    for (Identity identity : from) {
      dtoSet.add(asDto(identity));
    }
    return dtoSet;
  }

  public static Identity to(SampleIdentityDto from) {
    Identity to = new IdentityImpl();
    to.setSampleId(from.getSampleId());
    to.setInternalName(from.getInternalName());
    to.setExternalName(from.getExternalName());
    if (from.getDonorSex() != null) {
      to.setDonorSex(from.getDonorSex());
    }
    return to;
  }

  public static SampleNumberPerProjectDto asDto(SampleNumberPerProject from) {
    SampleNumberPerProjectDto dto = new SampleNumberPerProjectDto();
    dto.setId(from.getId());
    dto.setProjectId(from.getProject().getProjectId());
    dto.setHighestSampleNumber(from.getHighestSampleNumber());
    dto.setPadding(from.getPadding());
    dto.setCreatedById(from.getCreatedBy().getUserId());
    dto.setCreationDate(dateTimeFormatter.print(from.getCreationDate().getTime()));
    dto.setUpdatedById(from.getUpdatedBy().getUserId());
    dto.setLastUpdated(dateTimeFormatter.print(from.getLastUpdated().getTime()));
    return dto;
  }

  public static Set<SampleNumberPerProjectDto> asSampleNumberPerProjectDtos(Set<SampleNumberPerProject> from) {
    Set<SampleNumberPerProjectDto> dtoSet = Sets.newHashSet();
    for (SampleNumberPerProject sampleNumberPerProject : from) {
      dtoSet.add(asDto(sampleNumberPerProject));
    }
    return dtoSet;
  }

  public static SampleNumberPerProject to(SampleNumberPerProjectDto from) {
    SampleNumberPerProject to = new SampleNumberPerProjectImpl();
    to.setHighestSampleNumber(from.getHighestSampleNumber());
    to.setPadding(from.getPadding());
    return to;
  }

  public static SampleValidRelationshipDto asDto(SampleValidRelationship from) {
    SampleValidRelationshipDto dto = new SampleValidRelationshipDto();
    dto.setId(from.getId());
    dto.setParentId(from.getParent().getId());
    dto.setChildId(from.getChild().getId());
    dto.setCreatedById(from.getCreatedBy().getUserId());
    dto.setCreationDate(dateTimeFormatter.print(from.getCreationDate().getTime()));
    dto.setUpdatedById(from.getUpdatedBy().getUserId());
    dto.setLastUpdated(dateTimeFormatter.print(from.getLastUpdated().getTime()));
    return dto;
  }

  public static Set<SampleValidRelationshipDto> asSampleValidRelationshipDtos(Set<SampleValidRelationship> from) {
    Set<SampleValidRelationshipDto> dtoSet = Sets.newHashSet();
    for (SampleValidRelationship sampleValidRelationship : from) {
      dtoSet.add(asDto(sampleValidRelationship));
    }
    return dtoSet;
  }

  public static SampleValidRelationship to(SampleValidRelationshipDto from) {
    SampleValidRelationship to = new SampleValidRelationshipImpl();
    return to;
  }

  public static InstituteDto asDto(Institute from) {
    InstituteDto dto = new InstituteDto();
    dto.setId(from.getId());
    dto.setAlias(from.getAlias());
    dto.setCreatedById(from.getCreatedBy().getUserId());
    dto.setCreationDate(dateTimeFormatter.print(from.getCreationDate().getTime()));
    dto.setUpdatedById(from.getUpdatedBy().getUserId());
    dto.setLastUpdated(dateTimeFormatter.print(from.getLastUpdated().getTime()));
    return dto;
  }

  public static Set<InstituteDto> asInstituteDtos(Set<Institute> from) {
    Set<InstituteDto> dtoSet = Sets.newHashSet();
    for (Institute institute : from) {
      dtoSet.add(asDto(institute));
    }
    return dtoSet;
  }

  public static Institute to(InstituteDto from) {
    Institute to = new InstituteImpl();
    to.setAlias(from.getAlias());
    return to;
  }

  public static LabDto asDto(Lab from) {
    LabDto dto = new LabDto();
    dto.setId(from.getId());
    dto.setInstituteId(from.getInstitute().getId());
    dto.setAlias(from.getAlias());
    dto.setCreatedById(from.getCreatedBy().getUserId());
    dto.setCreationDate(dateTimeFormatter.print(from.getCreationDate().getTime()));
    dto.setUpdatedById(from.getUpdatedBy().getUserId());
    dto.setLastUpdated(dateTimeFormatter.print(from.getLastUpdated().getTime()));
    return dto;
  }

  public static Set<LabDto> asLabDtos(Collection<Lab> from) {
    Set<LabDto> dtoSet = Sets.newHashSet();
    for (Lab lab : from) {
      dtoSet.add(asDto(lab));
    }
    return dtoSet;
  }

  public static Lab to(LabDto from) {
    Lab to = new LabImpl();
    to.setAlias(from.getAlias());
    return to;
  }

  public static SampleTissueDto asDto(SampleTissue from) {
    SampleTissueDto dto = new SampleTissueDto();
    dto.setSampleId(from.getId());
    dto.setCellularity(from.getCellularity());
    dto.setCreatedById(from.getCreatedBy().getUserId());
    dto.setCreationDate(dateTimeFormatter.print(from.getCreationDate().getTime()));
    dto.setUpdatedById(from.getUpdatedBy().getUserId());
    dto.setLastUpdated(dateTimeFormatter.print(from.getLastUpdated().getTime()));
    return dto;
  }

  public static Set<SampleTissueDto> asSampleTissueDtos(Set<SampleTissue> from) {
    Set<SampleTissueDto> dtoSet = Sets.newHashSet();
    for (SampleTissue sampleTissue : from) {
      dtoSet.add(asDto(sampleTissue));
    }
    return dtoSet;
  }

  public static SampleTissue to(SampleTissueDto from) {
    SampleTissue to = new SampleTissueImpl();
    to.setId(from.getSampleId());
    to.setCellularity(from.getCellularity());
    return to;
  }

  public static KitDescriptorDto asDto(KitDescriptor from) {
    KitDescriptorDto dto = new KitDescriptorDto();
    dto.setId(from.getId());
    dto.setName(from.getName());
    dto.setManufacturer(from.getManufacturer());
    dto.setPartNumber(from.getPartNumber());
    dto.setVersion(from.getVersion());
    dto.setStockLevel(from.getStockLevel());
    dto.setKitType(from.getKitType().getKey());
    dto.setPlatformType(from.getPlatformType().getKey());
    return dto;
  }

  public static Set<KitDescriptorDto> asKitDescriptorDtos(Collection<KitDescriptor> from) {
    Set<KitDescriptorDto> dtoSet = Sets.newHashSet();
    for (KitDescriptor kd : from) {
      dtoSet.add(asDto(kd));
    }
    return dtoSet;
  }

  public static KitDescriptor to(KitDescriptorDto from) {
    KitDescriptor to = new KitDescriptor();
    if (from.getId() != null) to.setId(from.getId());
    to.setName(from.getName());
    to.setManufacturer(from.getManufacturer());
    to.setPartNumber(from.getPartNumber());
    to.setVersion(from.getVersion());
    to.setStockLevel(from.getStockLevel());
    to.setKitType(KitType.get(from.getKitType()));
    to.setPlatformType(PlatformType.get(from.getPlatformType()));
    return to;
  }

  public static LibraryAdditionalInfoDto asDto(LibraryAdditionalInfo from) {
    LibraryAdditionalInfoDto dto = new LibraryAdditionalInfoDto();
    dto.setLibraryId(from.getLibraryId());
    dto.setLibraryId(from.getLibrary().getId());
    dto.setTissueOrigin(asDto(from.getTissueOrigin()));
    dto.setTissueType(asDto(from.getTissueType()));
    if (from.getGroupId() != null) {
      dto.setGroupId(from.getGroupId());
    }
    if (from.getGroupDescription() != null) {
      dto.setGroupDescription(from.getGroupDescription());
    }
    if (from.getPrepKit() != null) {
      dto.setPrepKit(asDto(from.getPrepKit()));
    }
    dto.setCreatedById(from.getCreatedBy().getUserId());
    dto.setCreationDate(dateTimeFormatter.print(from.getCreationDate().getTime()));
    dto.setUpdatedById(from.getUpdatedBy().getUserId());
    dto.setLastUpdated(dateTimeFormatter.print(from.getLastUpdated().getTime()));
    dto.setArchived(from.getArchived());
    if (from.getLibraryDesign() != null) {
      dto.setLibraryDesignId(from.getLibraryDesign().getId());
    }
    return dto;
  }

  public static Set<LibraryAdditionalInfoDto> asLibraryAdditionalInfoDtos(Collection<LibraryAdditionalInfo> from) {
    Set<LibraryAdditionalInfoDto> dtoSet = Sets.newHashSet();
    for (LibraryAdditionalInfo l : from) {
      dtoSet.add(asDto(l));
    }
    return dtoSet;
  }

  public static LibraryAdditionalInfo to(LibraryAdditionalInfoDto from) {
    LibraryAdditionalInfo to = new LibraryAdditionalInfoImpl();
    to.setLibraryId(from.getLibraryId());
    to.setTissueOrigin(to(from.getTissueOrigin()));
    to.setTissueType(to(from.getTissueType()));
    if (from.getGroupId() != null) {
      to.setGroupId(from.getGroupId());
      to.setGroupDescription(from.getGroupDescription());
    }
    if (from.getPrepKit() != null) {
      to.setPrepKit(to(from.getPrepKit()));
    }
    to.setArchived(from.getArchived());
    return to;
  }

  public static PoolOrderDto asDto(PoolOrder from) {
    PoolOrderDto dto = new PoolOrderDto();
    dto.setId(from.getId());
    dto.setParameters(asDto(from.getSequencingParameter()));
    dto.setPartitions(from.getPartitions());
    dto.setCreatedById(from.getCreatedBy().getUserId());
    dto.setCreationDate(dateTimeFormatter.print(from.getCreationDate().getTime()));
    dto.setUpdatedById(from.getUpdatedBy().getUserId());
    dto.setLastUpdated(dateTimeFormatter.print(from.getLastUpdated().getTime()));
    return dto;
  }

  public static Set<PoolOrderDto> asPoolOrderDtos(Collection<PoolOrder> from) {
    Set<PoolOrderDto> dtoSet = Sets.newHashSet();
    for (PoolOrder po : from) {
      dtoSet.add(asDto(po));
    }
    return dtoSet;
  }

  public static PoolOrder to(PoolOrderDto from) {
    PoolOrder to = new PoolOrderImpl();
    to.setId(from.getId());
    to.setPartitions(from.getPartitions());
    return to;
  }

  public static SequencingParametersDto asDto(SequencingParameters from) {
    SequencingParametersDto dto = new SequencingParametersDto();
    dto.setId(from.getId());
    dto.setName(from.getName());
    dto.setPlatformId(from.getPlatformId());
    return dto;
  }

  public static Set<SequencingParametersDto> asSequencingParametersDtos(Collection<SequencingParameters> from) {
    Set<SequencingParametersDto> dtoSet = Sets.newTreeSet(new Comparator<SequencingParametersDto>() {

      @Override
      public int compare(SequencingParametersDto o1, SequencingParametersDto o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });
    for (SequencingParameters sp : from) {
      dtoSet.add(asDto(sp));
    }
    return dtoSet;
  }

  public static LibraryDto asDto(Library from, LibraryAdditionalInfo infoFrom) {
    LibraryDto dto = new LibraryDto();
    dto.setAlias(from.getAlias());
    dto.setName(from.getName());
    dto.setParentSampleId(from.getSample().getId());
    dto.setParentSampleAlias(from.getSample().getAlias());
    dto.setCreationDate(dateTimeFormatter.print(from.getCreationDate().getTime()));
    dto.setDescription(from.getDescription());
    dto.setId(from.getId());
    dto.setConcentration(from.getInitialConcentration());
    dto.setLibrarySelectionTypeId(from.getLibrarySelectionType().getId());
    dto.setLibraryStrategyTypeId(from.getLibraryStrategyType().getId());
    dto.setLibraryTypeId(from.getLibraryType().getId());
    dto.setLowQuality(from.isLowQuality());
    dto.setPaired(from.getPaired());
    dto.setPlatformName(from.getPlatformName());
    if (!from.getTagBarcodes().isEmpty()) {
      dto.setTagBarcodeStrategyName(from.getTagBarcodes().get(1).getFamily().getName());
      dto.setTagBarcodeIndex1Id(from.getTagBarcodes().get(1).getId());
      if (from.getTagBarcodes().size() > 1) {
        dto.setTagBarcodeIndex2Id(from.getTagBarcodes().get(2).getId());
      }
    }
    dto.setVolume(from.getVolume());
    if (infoFrom != null) {
      dto.setLibraryAdditionalInfo(asDto(infoFrom));
    }
    return dto;
  }

  public static Library to(LibraryDto from) {
    Library target = new LibraryImpl();
    return to(from, target);
  }

  /**
   * Overwrites all modifiable fields. Intended to be used with a freshly-loaded database object or newly-created impl so save and update
   * are similar.
   */
  public static Library to(LibraryDto from, Library to) {
    to.setAlias(from.getAlias());
    to.setName(from.getName());
    to.setDescription(from.getDescription());
    to.setIdentificationBarcode(from.getIdentificationBarcode());
    to.setInitialConcentration(from.getConcentration());
    to.setLowQuality(from.getLowQuality());
    to.setPaired(from.getPaired());
    to.setPlatformName(from.getPlatformName());
    to.setQcPassed(from.getQcPassed());
    if (from.getTagBarcodeIndex1Id() != null) {
      List<TagBarcode> tagBarcodes = new ArrayList<>();
      TagBarcode tb1 = new TagBarcode();
      tb1.setId(from.getTagBarcodeIndex1Id());
      tagBarcodes.add(tb1);
      if (from.getTagBarcodeIndex2Id() != null) {
        TagBarcode tb2 = new TagBarcode();
        tb2.setId(from.getTagBarcodeIndex2Id());
        tagBarcodes.add(tb2);
      }
      to.setTagBarcodes(tagBarcodes);
    }
    to.setVolume(from.getVolume());

    return to;
  }

  public static BoxDto asDto(Box from) {
    BoxDto dto = new BoxDto();
    dto.setId(from.getId());
    dto.setAlias(from.getAlias());
    dto.setDescription(from.getDescription());
    dto.setIdentificationBarcode(from.getIdentificationBarcode());
    dto.setUseId(from.getUse().getId());
    dto.setUseAlias(from.getUse().getAlias());
    dto.setSizeId(from.getSize().getId());
    dto.setRows(from.getSize().getRows());
    dto.setCols(from.getSize().getColumns());
    dto.setScannable(from.getSize().getScannable());
    dto.setItems(asBoxablesDtos(from.getBoxables()));
    return dto;
  }

  public static List<BoxableDto> asBoxablesDtos(Map<String, Boxable> boxables) {
    List<BoxableDto> items = new ArrayList<>();
    for (Entry<String, Boxable> entry : boxables.entrySet()) {
      items.add(asDto(entry.getValue(), entry.getKey()));
    }
    return items;
  }

  public static BoxableDto asDto(Boxable from) {
    return asDto(from, from.getBoxPosition());
  }

  public static BoxableDto asDto(Boxable from, String position) {
    BoxableDto dto = new BoxableDto();
    dto.setBoxPosition(position);
    dto.setId(from.getId());
    dto.setAlias(from.getAlias());
    dto.setBoxAlias(from.getBoxAlias());
    dto.setBoxPosition(from.getBoxPosition());
    dto.setEmpty(from.isEmpty());
    dto.setIdentificationBarcode(from.getIdentificationBarcode());
    dto.setName(from.getName());
    dto.setVolume(from.getVolume());
    return dto;
  }

  public static Box to(BoxDto from) {
    Box to = new BoxImpl();
    to.setId(from.getId());
    to.setAlias(from.getAlias());
    to.setDescription(from.getDescription());
    to.setIdentificationBarcode(from.getIdentificationBarcode());
    return to;
  }

  public static Boxable to(BoxableDto item, Boxable to) {
    to.setAlias(item.getAlias());
    to.setBoxPositionId(item.getId());
    to.setVolume(item.getVolume());
    to.setEmpty(item.getEmpty());
    return to;
  }

}
