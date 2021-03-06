package uk.ac.bbsrc.tgac.miso.core.data.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.eaglegenomics.simlims.core.User;

import uk.ac.bbsrc.tgac.miso.core.data.Lab;
import uk.ac.bbsrc.tgac.miso.core.data.QcPassedDetail;
import uk.ac.bbsrc.tgac.miso.core.data.Sample;
import uk.ac.bbsrc.tgac.miso.core.data.SampleAdditionalInfo;
import uk.ac.bbsrc.tgac.miso.core.data.SampleClass;
import uk.ac.bbsrc.tgac.miso.core.data.Subproject;
import uk.ac.bbsrc.tgac.miso.core.data.TissueOrigin;
import uk.ac.bbsrc.tgac.miso.core.data.TissueType;
import uk.ac.bbsrc.tgac.miso.core.data.impl.kit.KitDescriptor;

@Entity
@Table(name = "SampleAdditionalInfo")
public class SampleAdditionalInfoImpl implements SampleAdditionalInfo {

  @Id
  private Long sampleId;

  @OneToOne(targetEntity = SampleImpl.class)
  @JoinColumn(name = "sampleId", nullable = false)
  @MapsId
  private Sample sample;
  
  @ManyToOne(optional = true, targetEntity = SampleImpl.class)
  @JoinColumn(name = "parentId", nullable = true)
  private Sample parent;

  @Transient
  private Set<Sample> children = new HashSet<>();

  @OneToOne(targetEntity = SampleClassImpl.class)
  @JoinColumn(name = "sampleClassId", nullable = false)
  private SampleClass sampleClass;

  @OneToOne(targetEntity = TissueOriginImpl.class)
  @JoinColumn(name = "tissueOriginId")
  private TissueOrigin tissueOrigin;

  @OneToOne(targetEntity = TissueTypeImpl.class)
  @JoinColumn(name = "tissueTypeId")
  private TissueType tissueType;

  @OneToOne(targetEntity = QcPassedDetailImpl.class)
  @JoinColumn(name = "qcPassedDetailId")
  private QcPassedDetail qcPassedDetail;

  @OneToOne(targetEntity = SubprojectImpl.class)
  @JoinColumn(name = "subprojectId")
  private Subproject subproject;
  
  private String externalInstituteIdentifier;

  @OneToOne(targetEntity = LabImpl.class)
  @JoinColumn(name = "labId", nullable = true)
  private Lab lab;

  private Long kitDescriptorId;

  @Transient
  private KitDescriptor prepKit;

  private Integer passageNumber;

  private Integer timesReceived;

  private Integer tubeNumber;

  private Double concentration;

  @Column(nullable = false)
  private Boolean archived = Boolean.FALSE;
  
  private Integer siblingNumber;

  @OneToOne(targetEntity = UserImpl.class)
  @JoinColumn(name = "createdBy", nullable = false)
  private User createdBy;

  @Column(nullable = false)
  private Date creationDate;

  @OneToOne(targetEntity = UserImpl.class)
  @JoinColumn(name = "updatedBy", nullable = false)
  private User updatedBy;

  @Column(nullable = false)
  private Date lastUpdated;

  @Override
  public Long getId() {
    return sampleId;
  }

  @Override
  public void setId(Long sampleAdditionalInfoId) {
    this.sampleId = sampleAdditionalInfoId;
  }

  @Override
  public Sample getSample() {
    return sample;
  }

  @Override
  public void setSample(Sample sample) {
    this.sample = sample;
  }

  @Override
  public Sample getParent() {
    return parent;
  }

  @Override
  public void setParent(Sample parent) {
    this.parent = parent;
  }
  
  @Override
  public Set<Sample> getChildren() {
    return children;
  }
  
  @Override
  public void setChildren(Set<Sample> children) {
    this.children = children;
  }

  @Override
  public SampleClass getSampleClass() {
    return sampleClass;
  }

  @Override
  public void setSampleClass(SampleClass sampleClass) {
    this.sampleClass = sampleClass;
  }

  @Override
  public TissueOrigin getTissueOrigin() {
    return tissueOrigin;
  }

  @Override
  public void setTissueOrigin(TissueOrigin tissueOrigin) {
    this.tissueOrigin = tissueOrigin;
  }

  @Override
  public TissueType getTissueType() {
    return tissueType;
  }

  @Override
  public void setTissueType(TissueType tissueType) {
    this.tissueType = tissueType;
  }

  @Override
  public Subproject getSubproject() {
    return subproject;
  }

  @Override
  public void setSubproject(Subproject subproject) {
    this.subproject = subproject;
  }

  @Override
  public Integer getPassageNumber() {
    return passageNumber;
  }

  @Override
  public void setPassageNumber(Integer passageNumber) {
    this.passageNumber = passageNumber;
  }

  @Override
  public Integer getTimesReceived() {
    return timesReceived;
  }

  @Override
  public void setTimesReceived(Integer timesReceived) {
    this.timesReceived = timesReceived;
  }

  @Override
  public Integer getTubeNumber() {
    return tubeNumber;
  }

  @Override
  public void setTubeNumber(Integer tubeNumber) {
    this.tubeNumber = tubeNumber;
  }

  @Override
  public Double getConcentration() {
    return concentration;
  }

  @Override
  public void setConcentration(Double concentration) {
    this.concentration = concentration;
  }

  @Override
  public Boolean getArchived() {
    return archived;
  }

  @Override
  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  @Override
  public User getCreatedBy() {
    return createdBy;
  }

  @Override
  public void setCreatedBy(User createdBy) {
    this.createdBy = createdBy;
  }

  @Override
  public Date getCreationDate() {
    return creationDate;
  }

  @Override
  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  @Override
  public User getUpdatedBy() {
    return updatedBy;
  }

  @Override
  public void setUpdatedBy(User updatedBy) {
    this.updatedBy = updatedBy;
  }

  @Override
  public Date getLastUpdated() {
    return lastUpdated;
  }

  @Override
  public void setLastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  @Override
  public QcPassedDetail getQcPassedDetail() {
    return qcPassedDetail;
  }

  @Override
  public void setQcPassedDetail(QcPassedDetail qcPassedDetail) {
    this.qcPassedDetail = qcPassedDetail;
  }

  @Override
  public KitDescriptor getPrepKit() {
    return prepKit;
  }

  @Override
  public void setPrepKit(KitDescriptor prepKit) {
    this.prepKit = prepKit;

    // Keep kitDescriptorId field consistent for Hibernate persistence
    if (prepKit == null) {
      this.kitDescriptorId = null;
    } else {
      this.kitDescriptorId = prepKit.getId();
    }
  }
  
  @Override
  public String getExternalInstituteIdentifier() {
    return externalInstituteIdentifier;
  }
  
  @Override
  public void setExternalInstituteIdentifier(String externalInstituteIdentifier) {
    this.externalInstituteIdentifier = externalInstituteIdentifier;
  }

  @Override
  public Lab getLab() {
    return lab;
  }

  @Override
  public void setLab(Lab lab) {
    this.lab = lab;
  }

  @Override
  public Long getHibernateKitDescriptorId() {
    return kitDescriptorId;
  }
  

  @Override
  public Integer getSiblingNumber() {
    return siblingNumber;
  }

  @Override
  public void setSiblingNumber(Integer siblingNumber) {
    this.siblingNumber = siblingNumber;
  }

  @Override
  public String toString() {
    return "SampleAdditionalInfoImpl [sampleId=" + sampleId + ", sample="
        + sample + ", parent=" + parent + ", sampleClass=" + sampleClass
        + ", tissueOrigin=" + tissueOrigin + ", tissueType=" + tissueType
        + ", qcPassedDetail=" + qcPassedDetail + ", subproject=" + subproject
        + ", externalInstituteIdentifier=" + externalInstituteIdentifier
        + ", lab=" + lab + ", kitDescriptorId=" + kitDescriptorId
        + ", prepKit=" + prepKit + ", passageNumber=" + passageNumber
        + ", timesReceived=" + timesReceived + ", tubeNumber=" + tubeNumber
        + ", concentration=" + concentration + ", archived=" + archived
        + ", siblingNumber=" + siblingNumber + ", createdBy=" + createdBy
        + ", creationDate=" + creationDate + ", updatedBy=" + updatedBy
        + ", lastUpdated=" + lastUpdated + "]";
  }

}
