package com.java.bank.main;

import com.java.bank.dao.BankDao;
import com.java.bank.dao.BankDaoImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class CloseAccountMain {
  public static void main(String[] args) {
    int accountNo;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your account no    ");
    accountNo = sc.nextInt();
    BankDao bankDao = new BankDaoImpl();
    try {
      System.out.println(bankDao.closeAccount(accountNo));
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
