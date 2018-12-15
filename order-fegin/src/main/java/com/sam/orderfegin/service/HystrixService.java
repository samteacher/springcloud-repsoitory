package com.sam.orderfegin.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class HystrixService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 使用springcloud 中的 Hystrix 实现降级
     * @return
     */
    @HystrixCommand(fallbackMethod = "helloError")
    public List<String> helloService() {
        return restTemplate.getForObject("http://service-member/member/getMemberAll", List.class);
    }

    public List<String> helloError(){
        List<String> list = new ArrayList<>();
        list.add("哎呀，出错了！！");
        return list;
    }

}
