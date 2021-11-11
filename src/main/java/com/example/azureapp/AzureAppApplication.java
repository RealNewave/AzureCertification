package com.example.azureapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class AzureAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzureAppApplication.class, args);
    }

}
