package com.liuc.eureka.liuceureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer     //启用eureka服务端
public class LiucEurekaApplication {

    //服务注册与发现
    public static void main(String[] args) {
        SpringApplication.run(LiucEurekaApplication.class, args);
    }

}
