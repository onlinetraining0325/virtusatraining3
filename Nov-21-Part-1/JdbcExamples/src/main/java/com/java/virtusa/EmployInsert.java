package com.java.virtusa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployInsert {
  public static void main(String[] args) {
    int empno;
    String name,dept,desig,gender;
    double basic;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter employee no: ");
    empno = sc.nextInt();
    System.out.print("Enter employee name: ");
    name = sc.next();
    System.out.print("Enter employee Gender  : ");
    gender = sc.next();
    System.out.print("Enter employee department : ");
    dept = sc.next();
    System.out.print("Enter employee designation : ");
    desig = sc.next();
    System.out.print("Enter employee Basic : ");
    basic = sc.nextDouble();
    String cmd = "insert into Employ(empno,name,gender,dept,desig,basic) values (?,?,?,?,?,?)";
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/virtusa3","root","root");

      PreparedStatement pst = connection.prepareStatement(cmd);
      pst.setInt(1, empno);
      pst.setString(2, name);
      pst.setString(3, gender);
      pst.setString(4, dept);
      pst.setString(5, desig);
      pst.setDouble(6, basic);
      pst.executeUpdate();
      System.out.println("*** Employ Record Inserted ****");
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

  }
}
