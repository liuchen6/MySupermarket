package com.liuc.user.config;

import com.liuc.user.intercepter.MyIntercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
* 配置拦截器
* 1、声明该类是一个Java配置类
* 2、实现WebMvcConfigurer接口
* */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Autowired
    MyIntercepter myIntercepter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myIntercepter).addPathPatterns("/**");      //拦截任一级别路径
    }
}
