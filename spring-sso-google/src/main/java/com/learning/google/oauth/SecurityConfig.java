
package com.learning.google.oauth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class SecurityConfig {
    
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests()
                .anyRequest().authenticated()
                .and().oauth2Login();
    }
}
