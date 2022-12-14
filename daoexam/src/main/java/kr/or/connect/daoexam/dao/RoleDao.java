package kr.or.connect.daoexam.dao;

import kr.or.connect.daoexam.dto.Role;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.List;

import static kr.or.connect.daoexam.dao.RoleDaoSqls.SELECT_ALL;



  @Repository
  public class RoleDao {
    private NamedParameterJdbcTemplate jdbc;
    private SimpleJdbcInsert insertAction;
    private RowMapper<Role> rowMapper = BeanPropertyRowMapper.newInstance(Role.class);

    public RoleDao(DataSource dataSource) {
      this.jdbc = new NamedParameterJdbcTemplate(dataSource);
      this.insertAction = new SimpleJdbcInsert(dataSource)
          .withTableName("role");
    }

    public List<Role> selectAll(){
      return jdbc.query(SELECT_ALL, Collections.emptyMap(), rowMapper);
    }

  }