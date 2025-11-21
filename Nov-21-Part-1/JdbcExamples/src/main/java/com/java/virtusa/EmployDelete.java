package com.java.virtusa;

import java.sql.*;
import java.util.Scanner;

public class EmployDelete {
  public static void main(String[] args) {
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Empno : ");
    empno = sc.nextInt();
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/virtusa3","root","root");
      String cmd = "Delete from Employ where empno = ?";
      PreparedStatement pst = connection.prepareStatement(cmd);
      pst.setInt(1, empno);
      pst.executeUpdate();
      System.out.println("*** Record Deleted Successfully...");

    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
