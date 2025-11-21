package com.java.virtusa.main;

import com.java.virtusa.dao.EmployDao;
import com.java.virtusa.dao.EmployDaoImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployDeleteMain {
  public static void main(String[] args) {
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employ Number to delete  ");
    empno = sc.nextInt();
    EmployDao dao = new EmployDaoImpl();
    try {
      System.out.println(dao.deleteEmployDao(empno));
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
