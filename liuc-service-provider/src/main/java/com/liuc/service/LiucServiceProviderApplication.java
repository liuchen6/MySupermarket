package com.liuc.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.liuc.service.mapper")      //Mapper接口的包扫描
@EnableDiscoveryClient      //启用eureka客户端
public class LiucServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiucServiceProviderApplication.class, args);
    }

}
