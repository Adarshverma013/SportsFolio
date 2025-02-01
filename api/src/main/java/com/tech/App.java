package com.tech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.tech"}) // Adjust to match your package structure
@EntityScan(basePackages = "com.tech.entities") // Ensure it scans your JPA entities
@EnableJpaRepositories(basePackages = "com.tech.repository") // Ensure it scans your repositories
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
