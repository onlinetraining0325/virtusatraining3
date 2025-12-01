package com.java.spr.main;

import com.java.spr.dao.EmployDao;
import com.java.spr.model.Employ;
import com.java.spr.model.Gender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class UpdateEmployMain {
  public static void main(String[] args) {
    Employ employ = new Employ();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employ Number   ");
    employ.setEmpno(Integer.parseInt(sc.next()));
    System.out.println("Enter Employ Name");
    employ.setName(sc.next());
    System.out.println("Enter Employ Gender (MALE/FEMALE)  ");
    employ.setGender(Gender.valueOf(sc.next()));
    System.out.println("Enter Employ Department  ");
    employ.setDept(sc.next());
    System.out.println("Enter Employ Designation  ");
    employ.setDesig(sc.next());
    System.out.println("Enter Employ Basic  ");
    employ.setBasic(sc.nextDouble());
    ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
    EmployDao employDao =  (EmployDao) ctx.getBean("employDao");
    System.out.println(employDao.updateEmployDao(employ));
  }
}
