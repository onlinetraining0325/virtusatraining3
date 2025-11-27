package com.java.bank.dao;

import com.java.bank.model.Accounts;

import java.sql.SQLException;

public interface BankDao {
  String createAccount(Accounts account) throws SQLException, ClassNotFoundException;
  Accounts searchAccount(int accountNo) throws SQLException, ClassNotFoundException;
  String updateAccount(int accountNo, String city, String state) throws SQLException, ClassNotFoundException;
  String closeAccount(int accountNo) throws SQLException, ClassNotFoundException;
  String depositAccount(int accountNo, double amount) throws SQLException, ClassNotFoundException;
  String withdrawAccount(int accountNo, double amount) throws SQLException, ClassNotFoundException;
}
