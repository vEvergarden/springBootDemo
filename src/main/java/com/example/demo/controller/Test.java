package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Controller里面的方法都以json格式输出
public class Test {
    @RequestMapping("/")
    public String hello(){
        return "Hello hxy";
    }
    //public String

//    @RequestMapping("/getUser")
//    public User getTest(){
//        User user = new User("小明","1234");
//        return user;
//    }

}
