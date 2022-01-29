package com.example.jupiter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JupiterApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(JupiterApplication.class, args);
    }

}
