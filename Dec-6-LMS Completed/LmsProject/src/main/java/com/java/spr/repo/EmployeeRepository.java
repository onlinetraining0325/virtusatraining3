package com.java.spr.repo;

import com.java.spr.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    Employee findByEmpId(int empId);
}
