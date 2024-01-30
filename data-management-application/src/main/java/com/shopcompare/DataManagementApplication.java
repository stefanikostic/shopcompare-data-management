package com.shopcompare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.shopcompare.*")
public class DataManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataManagementApplication.class, args);
    }
}