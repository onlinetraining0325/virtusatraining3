package com.java.spr.service;

import com.java.spr.model.Employee;
import com.java.spr.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String addEmploy(Employee employee) {
        employeeRepository.save(employee);
        return "Employee added successfully";
    }

    public List<Employee> showEmployee() {
        return employeeRepository.findAll();
    }

    public Employee findById(int  empId) {
        return employeeRepository.findByEmpId(empId);
    }
}
