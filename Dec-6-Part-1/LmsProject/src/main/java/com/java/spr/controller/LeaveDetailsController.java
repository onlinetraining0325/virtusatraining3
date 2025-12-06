package com.java.spr.controller;

import com.java.spr.model.LeaveDetails;
import com.java.spr.repo.LeaveDetailsRepository;
import com.java.spr.service.LeaveDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/leave")
public class LeaveDetailsController {

    @Autowired
    private LeaveDetailsService leaveDetailsService;

    // APPLY LEAVE
    @PostMapping("/applyLeave")
    public ResponseEntity<String> applyLeave(@RequestBody LeaveDetails leaveDetails) {
        String result = leaveDetailsService.applyLeave(leaveDetails);

        return ResponseEntity
                .status(HttpStatus.CREATED)   // 201 Created
                .body(result);
    }

    // SHOW LEAVES OF EMPLOYEE
    @GetMapping("/showLeaves/{empId}")
    public ResponseEntity<List<LeaveDetails>> showLeave(@PathVariable int empId) {

        List<LeaveDetails> leaves = leaveDetailsService.showEmpLeaves(empId);

        if (leaves == null || leaves.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(leaves);   // return empty list with 404
        }

        return ResponseEntity.ok(leaves);   // 200 OK
    }
}
