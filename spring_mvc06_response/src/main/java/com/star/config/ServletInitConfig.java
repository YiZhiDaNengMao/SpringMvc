package com.star.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class ServletInitConfig extends
        AbstractAnnotationConfigDispatcherServletInitializer {
    //配置Spring容器
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    //配置SpringMVC容器
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //设置字符集过滤器 - 解决post乱码问题


    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter cf = new CharacterEncodingFilter();
        cf.setEncoding("utf8");
        return new Filter[]{cf};
    }
}
