package com.java.virtusa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployUpdate {
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

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/virtusa3","root","root");
      String cmd = "Update Employ Set Name = ?, Gender = ?, Dept = ?, Desig = ?, Basic = ? where Empno = ?";
      PreparedStatement pst = connection.prepareStatement(cmd);
      pst.setString(1, name);
      pst.setString(2, gender);
      pst.setString(3, dept);
      pst.setString(4, desig);
      pst.setDouble(5, basic);
      pst.setInt(6, empno);
      pst.executeUpdate();
      System.out.println("Employ updated successfully");
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
