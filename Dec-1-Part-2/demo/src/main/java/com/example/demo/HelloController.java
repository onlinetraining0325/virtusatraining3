package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value="/")
    public String hello(){
        return "Welcome to Spring Boot...";
    }

    @GetMapping(value="/topic")
    public String topic(){
        return "Java Spring Boot";
    }

    @GetMapping(value="/company")
    public String company(){
        return "Company is Virtusa...";
    }
}
