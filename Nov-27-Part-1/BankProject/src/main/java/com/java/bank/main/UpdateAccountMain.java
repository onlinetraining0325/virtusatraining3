package com.java.bank.main;

import com.java.bank.dao.BankDao;
import com.java.bank.dao.BankDaoImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class UpdateAccountMain {
  public static void main(String[] args) {
    int accountNo;
    String city, state;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter account no    ");
    accountNo = sc.nextInt();
    System.out.println("Enter account city    ");
    city = sc.next();
    System.out.println("Enter account state    ");
    state = sc.next();
    BankDao bankDao = new BankDaoImpl();
    try {
      System.out.println(bankDao.updateAccount(accountNo,city,state));
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
