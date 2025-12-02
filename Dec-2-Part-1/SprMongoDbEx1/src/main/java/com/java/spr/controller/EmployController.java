package com.java.spr.controller;

import com.java.spr.model.Employ;
import com.java.spr.repo.EmployRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployController {

    @Autowired
    private EmployRepository repository;

    @GetMapping(value="/showEmploy")
    public List<Employ> showEmploy(){
        return repository.findAll();
    }
}
