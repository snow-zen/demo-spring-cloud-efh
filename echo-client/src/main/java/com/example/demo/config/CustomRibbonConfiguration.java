package com.example.demo.config;

import com.example.demo.config.ribbon.RibbonEchoServerConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * @author snow-zen
 */
@Configuration
@RibbonClient(name = "demo-echo-server", configuration = RibbonEchoServerConfiguration.class)
public class CustomRibbonConfiguration {

}
