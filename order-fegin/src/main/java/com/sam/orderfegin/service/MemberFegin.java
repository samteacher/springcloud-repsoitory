package com.sam.orderfegin.service;


import com.sam.orderfegin.fallback.MemberFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * fegin客户端调用
 * ,fallback = MemberFallBack.class  熔断机制
 */
@FeignClient(name = "service-member",fallback = MemberFallBack.class)
public interface MemberFegin {

    @RequestMapping("/member/getMemberAll")
    List<String> getToOrderMemberAll();

}