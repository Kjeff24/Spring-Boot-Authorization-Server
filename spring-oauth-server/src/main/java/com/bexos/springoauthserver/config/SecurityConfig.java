package com.bexos.springoauthserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    UserDetailsService inMemoryUserDetailManager(){
        var userBuilder = User.builder();

        UserDetails jeff = userBuilder
                .username("kjeff")
                .password("{noop}kjeff")
                .roles("USER", "ADMIN")
                .build();
        return new InMemoryUserDetailsManager(jeff);
    }

}
