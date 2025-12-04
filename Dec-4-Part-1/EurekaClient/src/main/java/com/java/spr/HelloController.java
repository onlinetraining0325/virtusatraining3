package com.java.spr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value="/")
    public String show() {
        return "Welcome to Spring Boot...";
    }

    @GetMapping(value="/test")
    public String test() {
        return "Test Restful Web Service...";
    }
}
