package com.sam.eurekamemuber.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enr")
public class EnvirController {

    /**
     * Environment获取properties文件里的值
     */
    private Environment enr;

    @RequestMapping("/getEnvironment")
    public String getEnvirController(){
        System.out.println(enr.getProperty("server.port")+"============");
        return enr.getProperty("server.port");
    }

}
