package com.java.spr.sbsecuritynew;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class Config {

    // ⭐ In-memory users
    @Bean
    public UserDetailsService userDetailsService() {

        UserDetails admin = User.withUsername("Lokesh")
                .password("Punwani")
                .roles("admin_role")
                .build();

        UserDetails student = User.withUsername("harsh")
                .password("naidu")
                .roles("student_role")
                .build();

        return new InMemoryUserDetailsManager(admin, student);
    }

    // ⭐ Security rules
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        // 👉 PUBLIC ENDPOINT (No login required)
                        .requestMatchers("/home").permitAll()

                        // 👉 ADMIN ONLY
                        .requestMatchers("/delete").hasRole("admin_role")

                        // 👉 All other endpoints need authentication
                        .anyRequest().authenticated()
                )
                // Login types
                .httpBasic(Customizer.withDefaults())
                .formLogin(Customizer.withDefaults());

        return http.build();
    }

    // ⭐ No password encoding
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}