package com.java.spr.controller;

import com.java.spr.exception.ResourceNotFoundException;
import com.java.spr.model.Employee;
import com.java.spr.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/showEmployee")
    public ResponseEntity<List<Employee>> showEmployee() {
        List<Employee> employees = employeeService.showEmployee();
        return ResponseEntity.ok(employees);   // 200 OK
    }

    @GetMapping("/searchEmployee/{empId}")
    public ResponseEntity<Employee> searchEmployee(@PathVariable int empId) {

        Employee emp = employeeService.findById(empId);

        if (emp == null) {
            throw new ResourceNotFoundException("Employee not found with ID : " + empId);
        }

        return ResponseEntity.ok(emp);
    }

    @PostMapping("/addEmployee")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
        String result = employeeService.addEmploy(employee);

        return ResponseEntity.status(HttpStatus.CREATED)  // 201 Created
                .body(result);
    }
}