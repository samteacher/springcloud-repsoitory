package com.sam.eurekaorder.controller;

import com.sam.eurekaorder.service.OrderMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderMemberService orderMemberService;

    /**
     * 消费者
     * @return
     */
    @RequestMapping("/getOrderUserAll")
    public List<String> getOrderUserAll(){
        System.out.println("会员服务正在被消费");
        return orderMemberService.getOrderUserAll();
    }

    /**
     * 接口网关部分
     * @return
     */
    @RequestMapping("/gerOrderServiceApi")
    public String gerOrderServiceApi(){
        return "this is a order 服务工程";
    }

}
