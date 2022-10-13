package com.star.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.star.controller","com.star.config"})
@EnableWebMvc
public class SpringMvcConfig {

}
