package com.liuc.service.controller;

import com.liuc.service.pojo.User;
import com.liuc.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User queryUserById(@PathVariable("id")int id) {
        User user = this.userService.queryUserById(id);
        List<User> userList = this.userService.selectAll();
        System.out.println(user);
        return user;
    }
}
