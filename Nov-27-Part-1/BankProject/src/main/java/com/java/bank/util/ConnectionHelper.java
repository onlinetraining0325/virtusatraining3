package com.java.bank.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionHelper {

  public static Connection getConnection() throws ClassNotFoundException, SQLException {
    ResourceBundle rb = ResourceBundle.getBundle("db");
    String driver = rb.getString("driver");
    String url =  rb.getString("url");
    String user =  rb.getString("user");
    String password = rb.getString("password");
    Class.forName(driver);
    Connection conn = DriverManager.getConnection(url, user, password);
    return conn;
  }
}
