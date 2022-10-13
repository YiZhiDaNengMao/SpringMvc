package com.star.config;

import com.star.controller.interceptor.ProjectInterceptor;
import com.star.controller.interceptor.ProjectInterceptor02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    @Autowired
    ProjectInterceptor projectInterceptor;

    @Autowired
    ProjectInterceptor02 projectInterceptor02;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor)
                .addPathPatterns("/user","/user/*");
        registry.addInterceptor(projectInterceptor02)
                .addPathPatterns("/user","/user/*");
    }
}
