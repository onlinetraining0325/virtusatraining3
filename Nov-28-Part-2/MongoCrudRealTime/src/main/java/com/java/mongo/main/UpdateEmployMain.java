package com.java.mongo.main;

import com.java.mongo.dao.EmployDao;
import com.java.mongo.dao.EmployDaoImpl;
import com.java.mongo.model.Employ;

import java.util.Scanner;

public class UpdateEmployMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Employ employ = new Employ();
    System.out.println("Enter Employ Number  ");
    employ.setEmpno(sc.nextInt());
    System.out.println("Enter Employ Name ");
    employ.setName(sc.next());
    System.out.println("Enter Employ Department ");
    employ.setDept(sc.next());
    System.out.println("Enter Employ Designation ");
    employ.setDesig(sc.next());
    System.out.println("Enter Employ Salary ");
    employ.setBasic(sc.nextInt());
    EmployDao employDao = new EmployDaoImpl();
    System.out.println(employDao.updateEmployDao(employ));
  }
}
