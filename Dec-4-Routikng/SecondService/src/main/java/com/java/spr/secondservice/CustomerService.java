package com.java.spr.secondservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/customer")
public class CustomerService {

    @GetMapping(value="/show")
    public String showCustomer() {
        return "Welcome to Customer Module...";
    }

    @GetMapping(value="/lunch")
    public String lunch() {
        return "Lunch at 1 PM...";
    }

    @GetMapping(value="/topic")
    public String topic() {
        return "Topic JAVA Fsd with React...";
    }
}
