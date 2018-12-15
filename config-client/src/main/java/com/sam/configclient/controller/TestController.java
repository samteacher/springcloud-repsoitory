package com.sam.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /**
     * 分布式配置文件中心
     */
    @Value("${userName}")
    private String userName;

    @RequestMapping("/getUserName")
    public String getUserName() {
        return userName;
    }
}
