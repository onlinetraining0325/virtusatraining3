package com.java.spr.main;

import com.java.spr.dao.EmployDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class DeleteEmployMain {
  public static void main(String[] args) {
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter employ no:   ");
    empno = sc.nextInt();
    ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
    EmployDao dao = (EmployDao) ctx.getBean("employDao");
    System.out.println(dao.deleteEmployDao(empno));
  }
}
