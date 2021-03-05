package com.example.feign.test;

import com.example.feign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCtrl {
    @Autowired
    private UserService userService;

    @GetMapping("test")
    public String test(){
        return userService.index();
    }





}
