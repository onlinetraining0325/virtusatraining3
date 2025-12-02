package com.java.spr.controller;

import com.java.spr.model.Employ;
import com.java.spr.repo.EmployRepository;
import com.java.spr.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployController {

    @Autowired
    private EmployService service;

    @PutMapping(value="/updateEmploy")
    public String updateEmploy(@RequestBody Employ employ){
        return service.updateEmploy(employ);
    }

    @DeleteMapping(value="/deleteEmploy/{empno}")
    public String deleteEmploy(@PathVariable int empno){
        return service.deleteEmploy(empno);
    }
    @PostMapping(value="/addEmploy")
    public String addEmploy(@RequestBody Employ employ) {
        return service.addEmploy(employ);
    }

    @GetMapping(value="/searchEmploy/{id}")
    public Employ findByEmpno(@PathVariable int id){
        return service.search(id);
    }

    @GetMapping(value="/showEmploy")
    public List<Employ> showEmploy(){
        return service.findAll();
    }
}
