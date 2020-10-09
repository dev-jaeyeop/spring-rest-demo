package com.spring.rest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan("com.spring.rest")
@EnableWebMvc
@Configuration
public class DemoAppConfig {
}
