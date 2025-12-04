package com.java.spr;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("employeeModule", r -> r.path("/employee/**")
                        .uri("http://localhost:9001/"))
                .route("consumerModule", r -> r.path("/customer/**")
                        .uri("http://localhost:9002/"))
                .build();
    }
}