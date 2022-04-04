package com.spring.boot.example.springboot.mybatis.controller;


import com.spring.boot.example.springboot.mybatis.dao.User;
import com.spring.boot.example.springboot.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("{id}")
    public User getUserById(@PathVariable String id)
    {

        return userMapper.getUserById(id);
    }

    @GetMapping
    public List<User> getAll()
    {
        return userMapper.getAll();
    }
}