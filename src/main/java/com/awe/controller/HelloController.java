package com.awe.controller;

import com.awe.mapper.UserMapper;
import com.awe.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/* 为了让其返回字符串，我们可以用@RestController */
@RestController
public class HelloController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hello")
    public String hello(){
        List<User> users = userMapper.queryAllUsers();
        System.out.println(users);
        return "hello";
    }
}
