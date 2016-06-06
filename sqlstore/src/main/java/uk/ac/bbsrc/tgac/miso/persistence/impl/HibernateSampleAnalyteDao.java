package uk.ac.bbsrc.tgac.miso.persistence.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import uk.ac.bbsrc.tgac.miso.core.data.SampleAnalyte;
import uk.ac.bbsrc.tgac.miso.core.data.impl.SampleAnalyteImpl;
import uk.ac.bbsrc.tgac.miso.persistence.SampleAnalyteDao;

@Repository
@Transactional
public class HibernateSampleAnalyteDao implements SampleAnalyteDao {

  protected static final Logger log = LoggerFactory.getLogger(HibernateSampleAnalyteDao.class);

  @Autowired
  private SessionFactory sessionFactory;

  public void setSessionFactory(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  private Session currentSession() {
    return sessionFactory.getCurrentSession();
  }

  @Override
  public List<SampleAnalyte> getSampleAnalyte() {
    Query query = currentSession().createQuery("from SampleAnalyteImpl");
    @SuppressWarnings("unchecked")
    List<SampleAnalyte> records = query.list();
    return records;
  }

  @Override
  public SampleAnalyte getSampleAnalyte(Long id) {
    return (SampleAnalyte) currentSession().get(SampleAnalyteImpl.class, id);
  }

  @Override
  public SampleAnalyte getSampleAnalyteBySampleId(Long id) {
    Query query = currentSession().createQuery("from SampleAnalyteImpl where sampleId = :id");
    query.setLong("id", id);
    return (SampleAnalyte) query.uniqueResult();
  }

  @Override
  public void deleteSampleAnalyte(SampleAnalyte sampleAnalyte) {
    currentSession().delete(sampleAnalyte);
  }

}
