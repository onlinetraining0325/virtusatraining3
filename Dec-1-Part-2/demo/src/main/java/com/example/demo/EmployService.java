package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployService {

    Employ e1 = new  Employ(1,"Lokesh",88323);
    Employ e2 = new  Employ(2,"Bharathi",90012);
    Employ e3 = new  Employ(3,"Subham",98831);
    private List<Employ> employList = Arrays.asList(e1, e2, e3);

    public List<Employ> showEmploy() {
        return employList;
    }

    public Employ searchEmploy(int empno) {
        return employList.stream().filter(e -> e.getEmpno() == empno).findFirst().orElse(null);
    }
}
