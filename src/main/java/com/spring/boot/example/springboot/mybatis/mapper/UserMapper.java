package com.spring.boot.example.springboot.mybatis.mapper;

import com.spring.boot.example.springboot.mybatis.dao.User;

import java.util.List;

public interface UserMapper {

    User getUserById(String id);

    List<User> getAll();
}