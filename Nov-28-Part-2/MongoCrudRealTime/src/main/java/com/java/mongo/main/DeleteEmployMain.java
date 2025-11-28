package com.java.mongo.main;

import com.java.mongo.dao.EmployDao;
import com.java.mongo.dao.EmployDaoImpl;

import java.util.Scanner;

public class DeleteEmployMain {
  public static void main(String[] args) {
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter employ no:    ");
    empno = sc.nextInt();
    EmployDao empDao = new EmployDaoImpl();
    System.out.println(empDao.deleteEmployDao(empno));
  }
}
