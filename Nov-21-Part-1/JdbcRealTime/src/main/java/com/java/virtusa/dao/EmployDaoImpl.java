package com.java.virtusa.dao;

import com.java.virtusa.model.Employ;
import com.java.virtusa.model.Gender;
import com.java.virtusa.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployDaoImpl implements EmployDao {

  Connection con = null;
  PreparedStatement pst = null;


  @Override
  public List<Employ> showEmployDao() throws SQLException, ClassNotFoundException {
    con = ConnectionHelper.getConnection();
    String cmd = "select * from employ";
    pst = con.prepareStatement(cmd);
    ResultSet rs = pst.executeQuery();
    List<Employ> employs = new ArrayList<>();
    while (rs.next()) {
      Employ employ = new Employ();
      employ.setEmpno(rs.getInt("empno"));
      employ.setName(rs.getString("name"));
      employ.setGender(Gender.valueOf(rs.getString("gender")));
      employ.setDept(rs.getString("dept"));
      employ.setDesig(rs.getString("desig"));
      employ.setBasic(rs.getDouble("basic"));
      employs.add(employ);
    }
    return employs;
  }

  @Override
  public Employ searchEmployDao(int empno) throws SQLException, ClassNotFoundException {
    con = ConnectionHelper.getConnection();
    String cmd = "select * from employ where empno = ?";
    pst = con.prepareStatement(cmd);
    pst.setInt(1, empno);
    ResultSet rs = pst.executeQuery();
    Employ employ = null;
    if (rs.next()) {
      employ = new Employ();
      employ.setEmpno(rs.getInt("empno"));
      employ.setName(rs.getString("name"));
      employ.setGender(Gender.valueOf(rs.getString("gender")));
      employ.setDept(rs.getString("dept"));
      employ.setDesig(rs.getString("desig"));
      employ.setBasic(rs.getDouble("basic"));

    }
    return employ;
  }
}
