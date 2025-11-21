package com.java.virtusa;

import java.sql.*;

public class EmployShow {
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/virtusa3","root","root");
      String cmd = "select * from Employ";
      PreparedStatement preparedStatement = connection.prepareStatement(cmd);
      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        System.out.println("Employ No  " +resultSet.getInt("empno"));
        System.out.println("Employ Name  " +resultSet.getString("name"));
        System.out.println("Gender  " +resultSet.getString("gender"));
        System.out.println("Department  " +resultSet.getString("dept"));
        System.out.println("Designation  " +resultSet.getString("desig"));
        System.out.println("Basic  " +resultSet.getDouble("basic"));
        System.out.println("------------------------------------------");
      }
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
