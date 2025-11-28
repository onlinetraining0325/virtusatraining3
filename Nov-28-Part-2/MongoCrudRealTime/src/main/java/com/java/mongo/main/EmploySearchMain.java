package com.java.mongo.main;

import com.java.mongo.dao.EmployDao;
import com.java.mongo.dao.EmployDaoImpl;
import com.java.mongo.model.Employ;

import java.util.Scanner;

public class EmploySearchMain {
  public static void main(String[] args) {
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter employ no:    ");
    empno = sc.nextInt();
    EmployDao empDao = new EmployDaoImpl();
    Employ employ = empDao.searchEmployDao(empno);
    if (employ!=null) {
      System.out.println(employ);
    } else {
      System.out.println("Employe Not Found");
    }
  }
}
