package com.java.spr.main;

import com.java.spr.dao.EmployDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class LoginMain {
  public static void main(String[] args) {
    String user, pwd;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter User Name  ");
    user = sc.next();
    System.out.println("Enter Password  ");
    pwd = sc.next();
    ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
    EmployDao employDao = (EmployDao) context.getBean("employDao");
    int count = employDao.authenticate(user, pwd);
    if (count == 1) {
      System.out.println("Correct Credentials...");
    } else {
      System.out.println("Incorrect Credentials...");
    }
  }
}
