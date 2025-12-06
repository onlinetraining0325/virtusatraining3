package com.java.spr.repo;

import com.java.spr.model.LeaveDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LeaveDetailsRepository extends MongoRepository<LeaveDetails, String> {
    LeaveDetails findFirstByOrderByLeaveIdDesc();
    List<LeaveDetails> findByEmpId(int empId);
}
