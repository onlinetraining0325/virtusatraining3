package com.java.spr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaInnerEmpClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaInnerEmpClientApplication.class, args);
    }

}
