package com.java.virtusa.main;

import com.java.virtusa.dao.EmployDao;
import com.java.virtusa.dao.EmployDaoImpl;
import com.java.virtusa.model.Employ;
import com.java.virtusa.model.Gender;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployUpdateMain {
  public static void main(String[] args) {
    Employ employ = new Employ();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter employee no: ");
    employ.setEmpno(sc.nextInt());
    System.out.print("Enter employee name: ");
    employ.setName(sc.next());
    System.out.print("Enter employee Gender  : ");
    employ.setGender(Gender.valueOf(sc.next()));
    System.out.print("Enter employee department : ");
    employ.setDept(sc.next());
    System.out.print("Enter employee designation : ");
    employ.setDesig(sc.next());
    System.out.print("Enter employee Basic : ");
    employ.setBasic(sc.nextDouble());

    EmployDao employDao = new EmployDaoImpl();

    try {
      System.out.println(employDao.updateEmployDao(employ));
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
