package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/h2-console/**").permitAll() 
                        .anyRequest().permitAll())
                .headers(headers -> headers
                .frameOptions(cust -> cust.sameOrigin()))
                .httpBasic(basic -> basic.disable())
                .formLogin(login -> login.disable())
                .build();
    }
}
