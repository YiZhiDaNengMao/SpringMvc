package com.star.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

//设置这是一个配置类
@Configuration
//设置要加载的bean,扫描路径
@ComponentScan({"com.star.service"})
//加载配置文件
@PropertySource("classpath:jdbc.properties")
//加载其他的配置类
@Import({JdbcConfig.class,MyBatisConfig.class})
public class SpringConfig {

}
