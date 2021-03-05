package com.example.feign.service;

import org.springframework.stereotype.Component;

@Component
public class UserServiceError implements UserService{

    @Override
    public String index() {
        return "服务发生故障！";
    }
}
