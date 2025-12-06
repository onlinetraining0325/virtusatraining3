package com.java.spr.service;

import com.java.spr.model.Employee;
import com.java.spr.model.LeaveDetails;
import com.java.spr.repo.EmployeeRepository;
import com.java.spr.repo.LeaveDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LeaveDetailsService {

    @Autowired
    private LeaveDetailsRepository leaveDetailsRepository;

    @Autowired
    private EmployeeRepository  employeeRepository;

    public LeaveDetails getMaxLeaveRecord()
    {
        return leaveDetailsRepository.findFirstByOrderByLeaveIdDesc();
    }

    public List<LeaveDetails> showEmpLeaves(int empId) {
        return leaveDetailsRepository.findByEmpId(empId);
    }

    public String applyLeave(LeaveDetails leaveDetails) {
        System.out.println("Leave details: " + leaveDetails.getEmpId());
        Employee employee = employeeRepository.findByEmpId(leaveDetails.getEmpId());
        int balance = employee.getLeaveAvail();
        Date today = new Date();
        long ms =  today.getTime() -leaveDetails.getLeaveStartDate().getTime();
        int days = (int)( ms / (1000 * 60 * 60 * 24));
        if (days > 0) {
            return "Leave Start-Date Cannot be Yesterday...";
        }
        ms = today.getTime() - leaveDetails.getLeaveEndDate().getTime();
        days = (int)( ms / (1000 * 60 * 60 * 24));
        if (days > 0) {
            return "Leave End-Date Cannot be Yesterday...";
        }
        ms = leaveDetails.getLeaveEndDate().getTime() - leaveDetails.getLeaveStartDate().getTime();
        days = (int)( ms / (1000 * 60 * 60 * 24));
        if (days < 0) {
            return "Leave-Start Date Cannot be Greater Than Leave-End Date...";
        }
        if (balance - days < 0) {
            return "Insufficient Leave Balance...";
        }
        days++;
        balance -= days;
        employee.setLeaveAvail(balance);
        int lid = getMaxLeaveRecord().getLeaveId();
        lid++;
        leaveDetails.setLeaveId(lid);
        leaveDetails.setNoOfDays(days);
        leaveDetails.setLeaveStatus("PENDING");
        leaveDetails.setAppliedOn(today);
        leaveDetailsRepository.save(leaveDetails);
        employeeRepository.save(employee);
        return "Leave Applied Successfully...";
    }
}
