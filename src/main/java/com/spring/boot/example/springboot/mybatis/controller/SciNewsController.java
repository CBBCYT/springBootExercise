package com.spring.boot.example.springboot.mybatis.controller;


import com.spring.boot.example.springboot.mybatis.dao.SciNews;
import com.spring.boot.example.springboot.mybatis.dao.User;
import com.spring.boot.example.springboot.mybatis.mapper.SciNewsMapper;
import com.spring.boot.example.springboot.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class SciNewsController {

    @Autowired
    private SciNewsMapper sciNewsMapper;

    @Autowired
    private UserMapper userMapper;

    //模糊查询
    @GetMapping("{title}")
    public List<SciNews> getUserByTitle(@PathVariable String title)
    {
        title = "%"+title+"%";
        return sciNewsMapper.getByTitle(title);
    }

    //跨表查询
    @GetMapping("user/{id}")
    public User getUserInfo(@PathVariable Integer id)
    {
        String userId = sciNewsMapper.getById(id).getUserId();
        User user = userMapper.getUserById(userId);

        return user;
    }

    //插入
    @PostMapping
    public void insert(@RequestBody SciNews sciNews)
    {
        sciNewsMapper.insert(sciNews);
    }
}