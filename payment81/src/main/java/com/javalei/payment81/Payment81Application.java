package com.javalei.payment81;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Payment81Application {

    public static void main(String[] args) {
        SpringApplication.run(Payment81Application.class, args);
    }

}
