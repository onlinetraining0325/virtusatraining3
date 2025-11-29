package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
  public static void main(String[] args) {
    ApplicationContext  context = new ClassPathXmlApplicationContext("chatbot.xml");
    HelloWorld helloWorld = (HelloWorld) context.getBean("bean1");
    helloWorld.showInfo("Harsh");
  }
}
