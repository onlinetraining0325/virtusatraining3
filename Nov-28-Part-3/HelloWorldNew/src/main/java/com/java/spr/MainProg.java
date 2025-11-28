package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MainProg {
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("hello.xml");
    Date date =  new Date();
    int hr = date.getHours();
    HelloImpl impl = null;
    if (hr < 12) {
      impl = (HelloImpl) ctx.getBean("bean1");
    } else if (hr >= 12 && hr < 16) {
      impl = (HelloImpl) ctx.getBean("bean2");
    } else {
      impl = (HelloImpl) ctx.getBean("bean3");
    }

    System.out.println(impl.sayHello("Kratika"));
  }
}
