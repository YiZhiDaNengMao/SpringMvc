package com.star.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/* 设置对静态资源的访问放行 - 配置类*/
@Configuration
public class SpringMvcStatic extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        /*
            addResourceHandler(): 表示当前访问的路径 -> mvc
            addResourceLocations(): 表示要执行的目录路径
         */
        registry.addResourceHandler("/pages/**")
                .addResourceLocations("/pages/");
        registry.addResourceHandler("/css/**")
                .addResourceLocations("/css/");
        registry.addResourceHandler("/js/**")
                .addResourceLocations("/js/");
        registry.addResourceHandler("/plugins/**")
                .addResourceLocations("/plugins/");
    }
}
