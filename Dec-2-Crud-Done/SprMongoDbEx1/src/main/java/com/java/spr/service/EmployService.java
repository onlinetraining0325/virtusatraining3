package com.java.spr.service;

import com.java.spr.model.Employ;
import com.java.spr.repo.EmployRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployService {

    @Autowired
    private EmployRepository repository;

    public List<Employ> findAll() {
        return repository.findAll();
    }

    public String updateEmploy(Employ employ){
        repository.save(employ);
        return "Employ Record Updated...";
    }

    public String deleteEmploy(int empno){
        Employ employFound = search(empno);
        repository.delete(employFound);
        return "Employ Record Deleted...";
    }
    public String addEmploy(Employ employ) {
        repository.save(employ);
        return "Employ Record Inserted...";
    }
    public Employ search(int empno) {
        return repository.findByEmpno(empno);
    }
}
