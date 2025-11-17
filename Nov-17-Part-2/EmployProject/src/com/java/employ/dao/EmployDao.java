package com.java.employ.dao;

import com.java.employ.model.Employ;

import java.util.List;

public interface EmployDao {
    List<Employ> showEmployDao();
    String addEmployDao(Employ employ);
}
