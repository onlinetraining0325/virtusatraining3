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

  @Override
  public String addEmployDao(Employ employ) throws SQLException, ClassNotFoundException {
     String cmd = "Insert into Employ(empno,name,gender,dept,desig,basic) values(?,?,?,?,?,?)";
     con = ConnectionHelper.getConnection();
     pst = con.prepareStatement(cmd);
     pst.setInt(1,employ.getEmpno());
     pst.setString(2,employ.getName());
     pst.setString(3,employ.getGender().toString());
     pst.setString(4,employ.getDept());
     pst.setString(5,employ.getDesig());
     pst.setDouble(6,employ.getBasic());
     pst.executeUpdate();
     return "Employ Record Inserted...";
  }

  @Override
  public String updateEmployDao(Employ employ) throws SQLException, ClassNotFoundException {
    String cmd = "Update Employ Set Name = ?, Gender = ?, Dept = ?, Desig = ?, Basic = ? WHERE Empno = ?";
    con = ConnectionHelper.getConnection();
    pst = con.prepareStatement(cmd);

    pst.setString(1,employ.getName());
    pst.setString(2,employ.getGender().toString());
    pst.setString(3,employ.getDept());
    pst.setString(4,employ.getDesig());
    pst.setDouble(5,employ.getBasic());
    pst.setInt(6,employ.getEmpno());
    pst.executeUpdate();
    return "Employ Record Updated...";
  }

  @Override
  public String deleteEmployDao(int empno) throws SQLException, ClassNotFoundException {
    String cmd = "delete From Employ where empno = ?";
    con = ConnectionHelper.getConnection();
    pst = con.prepareStatement(cmd);
    pst.setInt(1, empno);
    pst.executeUpdate();
    return "Employ Record Deleted...";
  }
}
