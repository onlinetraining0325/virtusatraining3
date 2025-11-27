package com.java.bank.dao;

import com.java.bank.model.Accounts;
import com.java.bank.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankDaoImpl implements BankDao {

  Connection conn = null;
  PreparedStatement pstmt = null;

  public int generateAccountNo() throws SQLException, ClassNotFoundException {
    conn = ConnectionHelper.getConnection();
    String cmd = "select case when max(accountNo) IS NULL THEN 1 " +
      " else max(accountNo)+1 end accno from accounts";
    pstmt = conn.prepareStatement(cmd);
    ResultSet rs = pstmt.executeQuery();
    rs.next();
    int accno = rs.getInt("accno");
    return accno;
  }

  @Override
  public String createAccount(Accounts account) throws SQLException, ClassNotFoundException {
    int accno = generateAccountNo();
    account.setAccountNo(accno);
    conn = ConnectionHelper.getConnection();
    String cmd = "Insert into Accounts(AccountNo, FirstName, LastName, City, State, Amount, CheqFacil, AccountType) " +
      " values(?,?,?,?,?,?,?,?)";
    pstmt = conn.prepareStatement(cmd);
    pstmt.setInt(1, accno);
    pstmt.setString(2, account.getFirstName());
    pstmt.setString(3, account.getLastName());
    pstmt.setString(4, account.getCity());
    pstmt.setString(5, account.getState());
    pstmt.setDouble(6, account.getAmount());
    pstmt.setString(7, account.getCheqFacil());
    pstmt.setString(8, account.getAccountType());
    pstmt.executeUpdate();
    return "Bank Account Created Successfully...";
  }

  @Override
  public Accounts searchAccount(int accountNo) throws SQLException, ClassNotFoundException {
    conn = ConnectionHelper.getConnection();
    String cmd = "select * from Accounts where AccountNo = ?";
    pstmt = conn.prepareStatement(cmd);
    pstmt.setInt(1, accountNo);
    ResultSet rs = pstmt.executeQuery();
    Accounts accounts = null;
    if (rs.next()) {
      accounts = new Accounts();
      accounts.setAccountNo(rs.getInt("AccountNo"));
      accounts.setFirstName(rs.getString("FirstName"));
      accounts.setLastName(rs.getString("LastName"));
      accounts.setCity(rs.getString("City"));
      accounts.setState(rs.getString("State"));
      accounts.setAmount(rs.getDouble("Amount"));
      accounts.setCheqFacil(rs.getString("CheqFacil"));
      accounts.setAccountType(rs.getString("AccountType"));
    }
    return accounts;
  }

  @Override
  public String updateAccount(int accountNo, String city, String state) throws SQLException, ClassNotFoundException {
    Accounts accountFound = searchAccount(accountNo);
    if (accountFound !=null){
      conn = ConnectionHelper.getConnection();
      String cmd = "Update Accounts set City = ?, State = ? WHERE AccountNo = ?";
      pstmt = conn.prepareStatement(cmd);
      pstmt.setString(1, city);
      pstmt.setString(2, state);
      pstmt.setInt(3, accountNo);
      pstmt.executeUpdate();
      return "Account Updated Successfully...";
    }
    return "Account No Not Found...";

  }

  @Override
  public String closeAccount(int accountNo) throws SQLException, ClassNotFoundException {
    Accounts account = searchAccount(accountNo);
    if (account !=null){
      conn = ConnectionHelper.getConnection();
      String cmd = "Update Accounts set status = 'inactive' where AccountNo = ?";
      pstmt = conn.prepareStatement(cmd);
      pstmt.setInt(1, accountNo);
      pstmt.executeUpdate();
      return "Account Deleted Successfully...";
    }
    return "Account No Not Found...";
  }

  @Override
  public String depositAccount(int accountNo, double amount) throws SQLException, ClassNotFoundException {
    Accounts accounts = searchAccount(accountNo);
    if (accounts !=null){
      conn = ConnectionHelper.getConnection();
      String cmd = "Update Accounts set Amount = Amount + ? where AccountNo = ?";
      pstmt = conn.prepareStatement(cmd);
      pstmt.setDouble(1, amount);
      pstmt.setInt(2, accountNo);
      pstmt.executeUpdate();
      cmd = "Insert into Trans(AccountNo, TransAmount, TransType) values(?,?,?)";
      pstmt = conn.prepareStatement(cmd);
      pstmt.setInt(1, accountNo);
      pstmt.setDouble(2, amount);
      pstmt.setString(3, "C");
      pstmt.executeUpdate();
      return "Account Deposited Successfully...";
    }
    return "Account No NOt Found...";
  }

  @Override
  public String withdrawAccount(int accountNo, double amount) throws SQLException, ClassNotFoundException {
    Accounts accounts = searchAccount(accountNo);
    if (accounts !=null){
      double balance = accounts.getAmount();
      if (balance - amount >= 0) {
        conn = ConnectionHelper.getConnection();
        String cmd = "Update Accounts set Amount = Amount - ? where AccountNo = ?";
        pstmt = conn.prepareStatement(cmd);
        pstmt.setDouble(1, amount);
        pstmt.setInt(2, accountNo);
        pstmt.executeUpdate();
        cmd = "Insert into Trans(AccountNo, TransAmount, TransType) values(?,?,?)";
        pstmt = conn.prepareStatement(cmd);
        pstmt.setInt(1, accountNo);
        pstmt.setDouble(2, amount);
        pstmt.setString(3, "D");
        pstmt.executeUpdate();
        return "Account Withdraw Successfully...";
      } else {
        return "Insufficient Balance...";
      }
    }
    return "Account No Not Found...";
  }
}
