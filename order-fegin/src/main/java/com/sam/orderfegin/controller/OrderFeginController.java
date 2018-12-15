package com.sam.orderfegin.controller;

import com.sam.orderfegin.service.HystrixService;
import com.sam.orderfegin.service.MemberFegin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/order")
public class OrderFeginController {

    @Autowired
    private MemberFegin memberFegin;

    @Autowired
    private HystrixService hystrixService;

    /**
     * Jemter压测
     * 雪崩现象及解决方法
     */
    @RequestMapping("/getToOrderMemberAll")
    public List<String> getToOrderMemberAll(){
        System.out.println("order fegin 工程调用 member工程");
        return memberFegin.getToOrderMemberAll();
    }

    /**
     * Jemter压测
     * 雪崩现象及解决方法
     */
    @RequestMapping("/getOrderInfo")
    public String getOrderInfo(){
        return "getOrderInfo";
    }


    /**
     * Hystrix 断路器
     * @return
     */
    @RequestMapping("/hello")
    public List<String> hello() {
        System.out.println("order Hystrix 工程调用 member工程  使用Hystrix");
        return hystrixService.helloService();
    }
}
