package com.java.spr.service;

import com.java.spr.model.Employ;
import com.java.spr.repo.EmployRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployService {

    @Autowired
    private EmployRepository employRepository;

    public List<Employ> showEmploy() {
        return employRepository.findAll();
    }

    public Employ searchEmploy(int empno) {
        return employRepository.findById(empno).get();
    }

    public String addEmploy(Employ employ) {
        employRepository.save(employ);
        return "Employ Record Inserted...";
    }
}
