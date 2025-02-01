package com.tech.integrationTest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.tech.dao") // Adjust to match your package structure
@EntityScan(basePackages = "com.tech.entities") // Ensure it scans your JPA entities
@EnableJpaRepositories(basePackages = "com.tech.repository") // Ensure it scans your repositories
public class TestConfig {
}