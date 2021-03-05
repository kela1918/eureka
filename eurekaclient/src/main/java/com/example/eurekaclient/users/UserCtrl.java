package com.example.eurekaclient.users;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xzw
 * @create_date: 2020/2/20 15:29
 * @desc: 创建UserCtrl对外提供服务
 * @modifier:
 * @modified_date:
 * @desc:
 */
@RestController
public class UserCtrl {
    @Value("${server.port}")
    private int port;

    @GetMapping("index")
    public String index(){
        return "Get users, port：" + port;
    }
}
