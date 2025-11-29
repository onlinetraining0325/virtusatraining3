package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("employ.xml");
    Employ employ = (Employ)context.getBean("employ");
    System.out.println(employ);
  }
}
