package com.sam.eurekamemuber.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 提供者
 * @return
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @Value("${server.port}")
    private String serverPort;
    @Value("${spring.application.name}")
    private String applicationName;
    private static int count = 0;

    @RequestMapping("/getMemberAll")
    public List<String> getMemberAll(){
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            System.err.println("timeout.......");
        }
        count++;
        List<String> listUser = new ArrayList<String>();
        listUser.add("zhangsan");
        listUser.add("lisi");
        listUser.add("wangwu");
        listUser.add("count="+count);
        listUser.add("serverPort===" + serverPort);
        listUser.add("applicationName=="+applicationName);
        return listUser;
    }

    /**
     * zuul接口网关部分
     * @return
     */
    @RequestMapping("/gerMemberServiceApi")
    public String gerMemberServiceApi(){
        return "this is a member 服务工程";
    }
}
