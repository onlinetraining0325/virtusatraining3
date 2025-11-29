package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("person.xml");
    Person person1 = (Person) context.getBean("person1");
    Person person2 = (Person) context.getBean("person2");
    Person person3 = (Person) context.getBean("person3");

    person1.showAll();
    System.out.println("------------------------------------");
    person2.showAll();
    System.out.println("------------------------------------");
    person3.showAll();
  }
}
