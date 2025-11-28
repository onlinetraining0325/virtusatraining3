package com.java.mongo.main;

import com.java.mongo.dao.EmployDao;
import com.java.mongo.dao.EmployDaoImpl;
import com.java.mongo.model.Employ;

import java.util.List;

public class EmployShowMain {

  public static void main(String[] args) {
    EmployDao dao = new EmployDaoImpl();
    List<Employ> employList = dao.showEmployDao();
    for(Employ e : employList){
      System.out.println(e);
    }
  }
}
