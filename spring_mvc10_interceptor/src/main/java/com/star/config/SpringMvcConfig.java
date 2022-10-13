package com.star.config;

import com.star.controller.interceptor.ProjectInterceptor;
import com.star.controller.interceptor.ProjectInterceptor02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan({"com.star.controller"/*,"com.star.config"*/})
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {
    @Autowired
    ProjectInterceptor projectInterceptor;

    @Autowired
    ProjectInterceptor02 projectInterceptor02;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor)
                .addPathPatterns("/user","/user/*");
        registry.addInterceptor(projectInterceptor02)
                .addPathPatterns("/user","/user/*");
    }

}
