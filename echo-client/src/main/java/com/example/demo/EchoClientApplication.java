package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @author snow-zen
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@ComponentScan(excludeFilters = {
        @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.example.demo.config.ribbon.*")
})
public class EchoClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EchoClientApplication.class, args);
    }
}
