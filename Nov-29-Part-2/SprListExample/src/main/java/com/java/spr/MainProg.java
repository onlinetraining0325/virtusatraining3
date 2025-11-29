package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("faculty.xml");
    Faculty faculty = (Faculty) context.getBean("beanFaculty");
    faculty.teaching();
  }
}
