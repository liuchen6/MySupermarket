package com.liuc.service.service;

import com.liuc.service.mapper.UserMapper;
import com.liuc.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUserById(int id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    public List<User> selectAll() {
        return this.userMapper.selectAll();
    }
}
