package com.sam.orderfegin.fallback;


import com.sam.orderfegin.service.MemberFegin;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 *  Hystrix断路器
 */
@Component
public class MemberFallBack implements MemberFegin {

    /**
     * 服务降级处理
     * @return
     * 降级、超时都会走这个方法
     */
    @Override
    public List<String> getToOrderMemberAll() {
        List<String> list = new ArrayList<>();
        list.add("服务发生异常...");
        return list;
    }
}
