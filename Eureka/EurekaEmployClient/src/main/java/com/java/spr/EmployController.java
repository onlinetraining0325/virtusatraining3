package com.java.spr;

import com.java.spr.model.Employ;
import com.java.spr.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/employ")
public class EmployController {

    @Autowired
    private EmployService employService;

    @GetMapping(value="/showEmploy")
    public List<Employ> showEmploy(){
        return employService.showEmploy();
    }

    @PostMapping(value="/addEmploy")
    public String addEmploy(@RequestBody Employ employ){
        return  employService.addEmploy(employ);
    }

    @GetMapping(value="/search/{empno}")
    public Employ searchEmploy(@PathVariable int empno) {
        return employService.searchEmploy(empno);
    }
}
