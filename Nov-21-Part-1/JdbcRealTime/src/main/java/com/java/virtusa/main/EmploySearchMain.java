package com.java.virtusa.main;

import com.java.virtusa.dao.EmployDao;
import com.java.virtusa.dao.EmployDaoImpl;
import com.java.virtusa.model.Employ;

import java.sql.SQLException;
import java.util.Scanner;

public class EmploySearchMain {
  public static void main(String[] args) {
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employ Number  ");
    empno = sc.nextInt();
    EmployDao employDao = new EmployDaoImpl();
    try {
      Employ employ = employDao.searchEmployDao(empno);
      if (employ !=null) {
        System.out.println(employ);
      } else {
        System.out.println("Employ Not Found");
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }

  }

}
