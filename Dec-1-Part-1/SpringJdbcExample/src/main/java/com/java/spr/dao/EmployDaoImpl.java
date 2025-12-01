package com.java.spr.dao;

import com.java.spr.model.Employ;
import com.java.spr.model.Gender;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployDaoImpl implements EmployDao {

  public JdbcTemplate getJdbcTemplate() {
    return jdbcTemplate;
  }

  public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  private JdbcTemplate jdbcTemplate;

  @Override
  public List<Employ> showEmployDao() {
    String cmd = "select * from employ";
    List<Employ> employList = jdbcTemplate.query(cmd, new RowMapper<Employ>() {

      @Override
      public Employ mapRow(ResultSet resultSet, int i) throws SQLException {
        Employ employ = new Employ();
        employ.setEmpno(resultSet.getInt("empno"));
        employ.setName(resultSet.getString("name"));
        employ.setGender(Gender.valueOf(resultSet.getString("gender")));
        employ.setDept(resultSet.getString("dept"));
        employ.setDesig(resultSet.getString("desig"));
        employ.setBasic(resultSet.getDouble("basic"));
        return employ;
      }
    });
    return employList;
  }

  @Override
  public Employ showEmployDao(int empno) {
    String cmd = "select * from employ where empno = ?";
    List<Employ> employList = jdbcTemplate.query(cmd, new Object[]{empno}, new RowMapper<Employ>() {

      @Override
      public Employ mapRow(ResultSet resultSet, int i) throws SQLException {
        Employ employ = new Employ();
        employ.setEmpno(resultSet.getInt("empno"));
        employ.setName(resultSet.getString("name"));
        employ.setGender(Gender.valueOf(resultSet.getString("gender")));
        employ.setDept(resultSet.getString("dept"));
        employ.setDesig(resultSet.getString("desig"));
        employ.setBasic(resultSet.getDouble("basic"));
        return employ;
      }
    });
    if (employList.size() != 0) {
      return employList.get(0);
    }
    return null;
  }

  @Override
  public String addEmployDao(Employ employ) {
   String cmd = "insert into Employ(empno,name,gender,dept,desig,basic) values(?,?,?,?,?,?)";
   jdbcTemplate.update(cmd, new Object[]{employ.getEmpno(), employ.getName(),
     employ.getGender().toString(), employ.getDept(), employ.getDesig(), employ.getBasic()
   });
   return "Employ Record Inserted...";
  }

  @Override
  public String updateEmployDao(Employ employ) {
    String cmd = "Update Employ set Name = ?, Gender = ?, Dept = ?, Desig = ?, Basic = ? where Empno = ?";
    jdbcTemplate.update(cmd, new Object[]{employ.getName(),
      employ.getGender().toString(), employ.getDept(), employ.getDesig(), employ.getBasic(), employ.getEmpno()
    });
    return "Employ Record Updated...";
  }

  @Override
  public String deleteEmployDao(int empno) {
    String cmd = "Delete from Employ where empno = ?";
    jdbcTemplate.update(cmd, new Object[]{empno});
    return "Employ Record Deleted...";
  }

  @Override
  public int authenticate(String user, String pwd) {
    String cmd = "select count(*) cnt from Login where userName=? AND Passcode=?";
    List<Integer> count =jdbcTemplate.query(cmd, new Object[]{user, pwd}, new RowMapper<Integer>() {

      @Override
      public Integer mapRow(ResultSet resultSet, int i) throws SQLException {
        return resultSet.getInt("cnt");
      }
    });
    return count.get(0);
  }
}
