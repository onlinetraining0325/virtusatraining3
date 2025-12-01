package com.java.spr.main;

import com.java.spr.dao.EmployDaoImpl;
import com.java.spr.model.Employ;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class EmployShowMain {
  public static void main(String[] args) {
    ApplicationContext  context = new ClassPathXmlApplicationContext("jdbc.xml");
    EmployDaoImpl impl = (EmployDaoImpl) context.getBean("employDao");
    List<Employ> employList = impl.showEmployDao();
    for (Employ employ : employList) {
      System.out.println(employ);
    }
  }
}
