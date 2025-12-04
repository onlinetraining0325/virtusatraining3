package com.java.spr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployController {

	@GetMapping("/message")
	public String test()
    {
        return "Welcome to API Gateway this is from FirstService...Actual Port is 9001";
	}

    @GetMapping(value="/trainer")
    public String trainer() {
        return "Trainer is Prasanna Pappu...";
    }

    @GetMapping(value="/company")
    public String company() {
        return "Company is Virtusa...";
    }
}
