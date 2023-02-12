package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author snow-zen
 */
@EnableEurekaClient
@SpringBootApplication
public class EchoServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EchoServerApplication.class, args);
    }
}
