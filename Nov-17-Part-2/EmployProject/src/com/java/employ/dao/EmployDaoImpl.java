package com.java.employ.dao;

import com.java.employ.model.Employ;

import java.util.ArrayList;
import java.util.List;

public class EmployDaoImpl implements EmployDao {

    static List<Employ> employList;

    static {
        employList = new ArrayList<Employ>();
    }

    @Override
    public List<Employ> showEmployDao() {
        return employList;
    }

    @Override
    public String addEmployDao(Employ employ) {
        employList.add(employ);
        return "Employ Record Inserted...";
    }
}
