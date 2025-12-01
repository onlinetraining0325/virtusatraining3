package com.java.spr.dao;

import com.java.spr.model.Employ;

import java.util.List;

public interface EmployDao {
  List<Employ> showEmployDao();
  Employ showEmployDao(int id);
  String addEmployDao(Employ employ);
  String updateEmployDao(Employ employ);
  String deleteEmployDao(int empno);
  int authenticate(String user, String pwd);
}
