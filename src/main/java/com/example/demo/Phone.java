package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Phone {

    private String mob;

    public Phone(){
        this.mob="75503 4879";
    }
    @Bean
    public String getMob() {
        return mob;
    }
}
