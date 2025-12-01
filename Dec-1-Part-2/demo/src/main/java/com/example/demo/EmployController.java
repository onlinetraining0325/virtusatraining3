package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployController {

    @Autowired
    private EmployService service;

    @GetMapping(value="/showEmploy")
    public List<Employ> show() {
        return service.showEmploy();
    }

    @GetMapping(value="/searchEmploy/{id}")
    public Employ searchEmploy(@PathVariable int id) {
        return service.searchEmploy(id);
    }
}
