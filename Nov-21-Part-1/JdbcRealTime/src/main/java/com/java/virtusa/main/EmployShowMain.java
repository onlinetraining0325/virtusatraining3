package com.java.virtusa.main;

import com.java.virtusa.dao.EmployDao;
import com.java.virtusa.dao.EmployDaoImpl;
import com.java.virtusa.model.Employ;

import java.sql.SQLException;
import java.util.List;

public class EmployShowMain {
  public static void main(String[] args) {
    EmployDao dao = new EmployDaoImpl();
    try {
      List<Employ> employList = dao.showEmployDao();
      for (Employ employ : employList) {
        System.out.println(employ);
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
