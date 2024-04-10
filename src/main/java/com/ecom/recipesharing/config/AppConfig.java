package com.ecom.recipesharing.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AppConfig {
    SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{
        http.sessionManagement(management-> management.sessionCreationPolicy(
                SessionCreationPolicy.STATELESS
        )).authorizeHttpRequests(

        )
        return  null;
    }
}