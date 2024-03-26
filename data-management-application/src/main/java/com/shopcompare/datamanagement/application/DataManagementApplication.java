package com.shopcompare.datamanagement.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Spring boot application class for Data management application.
 */
@SpringBootApplication
@EnableJpaRepositories(value = "com.shopcompare.datamanagement")
@ComponentScan(value = "com.shopcompare.datamanagement")
@EntityScan("com.shopcompare.datamanagement.*")
public class DataManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataManagementApplication.class, args);
    }
}