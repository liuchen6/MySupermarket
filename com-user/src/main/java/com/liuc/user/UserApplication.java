package com.liuc.user;

import com.liuc.user.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        //启动类
        SpringApplication.run(UserApplication.class);
    }
}
