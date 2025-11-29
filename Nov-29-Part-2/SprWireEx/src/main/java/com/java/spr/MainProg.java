package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("trainer.xml");
    Trainer trainer = (Trainer) ctx.getBean("beanTrainer");
    trainer.showAllInfo();
  }
}
