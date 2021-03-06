package uk.ac.bbsrc.tgac.miso.sqlstore;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;

import uk.ac.bbsrc.tgac.miso.core.data.ChangeLog;
import uk.ac.bbsrc.tgac.miso.core.store.ChangeLogStore;
import uk.ac.bbsrc.tgac.miso.core.util.CoverageIgnore;

@Transactional(rollbackFor = Exception.class)
public class SQLChangeLogDAO implements ChangeLogStore {
  private static class ChangeLogMapper implements RowMapper<ChangeLog> {

    @Override
    @CoverageIgnore
    public ChangeLog mapRow(ResultSet rs, int rownum) throws SQLException {
      ChangeLog cl = new ChangeLog();
      cl.setColumnsChanged(rs.getString("columnsChanged"));
      cl.setSummary(rs.getString("message"));
      cl.setTime(rs.getTimestamp("changeTime"));
      return cl;
    }

  }

  public static final String CHANGELOG_SELECT = "SELECT c.columnsChanged, c.message, c.changeTime FROM %sChangeLog c";
  public static final String CHANGELOG_SELECT_WHERE = CHANGELOG_SELECT + " WHERE c.%sId = ? ORDER BY c.changeTime DESC";

  private JdbcTemplate template;

  @CoverageIgnore
  public SQLChangeLogDAO() {
  }

  @CoverageIgnore
  public JdbcTemplate getJdbcTemplate() {
    return template;
  }

  @Override
  @CoverageIgnore
  public Collection<ChangeLog> listAll(String type) {
    return template.query(String.format(CHANGELOG_SELECT, type), new ChangeLogMapper());
  }

  @Override
  @CoverageIgnore
  public Collection<ChangeLog> listAllById(String type, long id) {
    char lowerTypeName[] = type.toCharArray();
    lowerTypeName[0] = Character.toLowerCase(lowerTypeName[0]);
    return listAllById(type, new String(lowerTypeName), id);
  }

  @Override
  @CoverageIgnore
  public Collection<ChangeLog> listAllById(String type, String idName, long id) {
    return template.query(String.format(CHANGELOG_SELECT_WHERE, type, idName), new Object[] { id }, new ChangeLogMapper());
  }

  @CoverageIgnore
  public void setJdbcTemplate(JdbcTemplate template) {
    this.template = template;
  }
}
