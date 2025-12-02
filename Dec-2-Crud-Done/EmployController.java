package com.java.spr.controller;

import com.java.spr.model.Employ;
import com.java.spr.repo.EmployRepository;
import com.java.spr.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/employ")
public class EmployController {

    @Autowired
    private EmployService service;

    // ADD EMPLOY -------------------------------------------------------
    @PostMapping("/add")
    public ResponseEntity<String> addEmploy(@RequestBody Employ employ) {
        String message = service.addEmploy(employ);
        return ResponseEntity.status(HttpStatus.CREATED).body(message);
    }

    // UPDATE EMPLOY -----------------------------------------------------
    @PutMapping("/update")
    public ResponseEntity<String> updateEmploy(@RequestBody Employ employ) {
        String message = service.updateEmploy(employ);
        return ResponseEntity.ok(message);  // 200 OK
    }

    // DELETE EMPLOY ----------------------------------------------------
    @DeleteMapping("/delete/{empno}")
    public ResponseEntity<String> deleteEmploy(@PathVariable int empno) {
        String message = service.deleteEmploy(empno);
        return ResponseEntity.ok(message);
    }

    // SEARCH EMPLOY BY ID ---------------------------------------------
    @GetMapping("/search/{empno}")
    public ResponseEntity<Employ> findByEmpno(@PathVariable int empno) {
        Employ employ = service.search(empno);
        if (employ == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(employ);
    }

    // SHOW ALL EMPLOY --------------------------------------------------
    @GetMapping("/showemploy")
    public ResponseEntity<List<Employ>> showEmploy() {
        List<Employ> list = service.findAll();
        return ResponseEntity.ok(list);
    }
}