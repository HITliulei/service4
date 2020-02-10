package com.test.service4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Service4Application {

    public static void main(String[] args) {
        SpringApplication.run(Service4Application.class, args);
    }

}
