package com.liuyanan.controller;

import com.liuyanan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by songliangliang on 2017/10/14.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/say")
    public String sayHello() {
        userService.insertUser();
        return "hello world !";
    }
}
