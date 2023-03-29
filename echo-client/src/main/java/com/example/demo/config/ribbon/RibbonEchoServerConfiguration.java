package com.example.demo.config.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author snow-zen
 */
@Configuration
public class RibbonEchoServerConfiguration {

    @Bean
    public IRule echoServerIRule() {
        return new RoundRobinRule();
    }
}
