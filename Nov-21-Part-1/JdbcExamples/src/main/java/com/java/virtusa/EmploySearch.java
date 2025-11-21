package com.java.virtusa;

import java.sql.*;
import java.util.Scanner;

public class EmploySearch {
  public static void main(String[] args) {
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter employee no: ");
    empno = sc.nextInt();
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/virtusa3","root","root");
      String cmd = "select * from Employ where empno = ?";
      PreparedStatement pst = connection.prepareStatement(cmd);
      pst.setInt(1, empno);
      ResultSet rs = pst.executeQuery();
      if (rs.next()) {
        System.out.println("Employ No  " +rs.getInt("empno"));
        System.out.println("Employ Name  " +rs.getString("name"));
        System.out.println("Gender  " +rs.getString("gender"));
        System.out.println("Department  " +rs.getString("dept"));
        System.out.println("Designation  " +rs.getString("desig"));
        System.out.println("Basic  " +rs.getDouble("basic"));
      } else {
        System.out.println("Employ Record Not Found...");
      }
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
