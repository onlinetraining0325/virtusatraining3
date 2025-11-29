package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MainProg {

  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
    int hr = new Date().getHours();
    HelloImpl helloImpl = null;
    if (hr < 12) {
       helloImpl = (HelloImpl) ctx.getBean("bean1");
    } else if (hr >=12 && hr < 16) {
      helloImpl = (HelloImpl) ctx.getBean("bean2");
    } else {
      helloImpl = (HelloImpl) ctx.getBean("bean3");
    }

    System.out.println(helloImpl.sayHello("Prasanna"));
  }
}
