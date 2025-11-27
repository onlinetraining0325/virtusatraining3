package com.java.bank.main;

import com.java.bank.dao.BankDao;
import com.java.bank.dao.BankDaoImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class DepositAccountMain {
  public static void main(String[] args) {
    double amount;
    int accountNo;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Account No:");
    accountNo = sc.nextInt();
    System.out.println("Enter Amount to Deposit:");
    amount = sc.nextDouble();
    BankDao dao = new BankDaoImpl();
    try {
      System.out.println(dao.depositAccount(accountNo,amount));
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
