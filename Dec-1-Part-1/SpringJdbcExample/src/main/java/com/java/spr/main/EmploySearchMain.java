package com.java.spr.main;

import com.java.spr.dao.EmployDao;
import com.java.spr.dao.EmployDaoImpl;
import com.java.spr.model.Employ;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class EmploySearchMain {
  public static void main(String[] args) {
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employ Number   ");
    empno = sc.nextInt();
    ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
    EmployDao employDao = (EmployDao) ctx.getBean("employDao");
    Employ employ = employDao.showEmployDao(empno);
    if (employ != null) {
      System.out.println(employ);
    } else {
      System.out.println("Employe Not Found");
    }
  }
}
