package com.java.spr.controller;

import com.java.spr.exception.AlreadyExistsException;
import com.java.spr.exception.ResourceNotFoundException;
import com.java.spr.model.Employ;
import com.java.spr.repo.EmployRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    private EmployRepository employRepository;

    @PostMapping("/addemployNew")
    public ResponseEntity<String> addEmploy(@RequestBody Employ employ) {
        Employ employFound = employRepository.findByEmpno(employ.getEmpno());
        if (employFound == null) {
            employRepository.save(employ);
            return ResponseEntity.status(HttpStatus.CREATED).body("Record Inserted...");
        }
        else {
            throw new AlreadyExistsException("Employee Already Exists...");
        }
    }

    @GetMapping("/searchnew/{empno}")
    public ResponseEntity<Employ> findByEmpno(@PathVariable int empno) {
        Employ employ = employRepository.findByEmpno(empno);
        if (employ == null) {
           throw new ResourceNotFoundException("Employee Not Found...");
        }
        return ResponseEntity.ok(employ);
    }
    @GetMapping("/empsearchnew/{id}")
    public ResponseEntity<Employ> search(@PathVariable String id) {
        Employ emp = employRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("employee record not found"));
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }

    @GetMapping(value="/showEmployNew")
    public ResponseEntity<?> showEmployNew(){
        List<Employ> list = employRepository.findAll();
        return ResponseEntity.ok(list);
    }
}
