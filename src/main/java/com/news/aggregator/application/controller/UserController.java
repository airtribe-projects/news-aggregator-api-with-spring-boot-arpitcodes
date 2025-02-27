package com.news.aggregator.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class UserController {
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello world";
    }
    @PostMapping("/register")
    public String registerUser(){
        return "user registration is in progress.";
    }
    @PostMapping("/login")
    public String loginUser(){
        return "user login is in progress.";
    }
}
