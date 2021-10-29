package com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;

@SpringBootApplication
@LoadBalancerClient(name = "forex-service")
public class SpringBootMicroserviceForexServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMicroserviceForexServiceApplication.class, args);
    }

}
