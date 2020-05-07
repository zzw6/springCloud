package com.javalei.enrekaserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Enrekaserver2Application {

    public static void main(String[] args) {
        SpringApplication.run(Enrekaserver2Application.class, args);
    }

}
