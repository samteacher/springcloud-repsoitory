package com.sam.springmybatis.action;

import com.sam.springmybatis.entity.AdminUser;
import com.sam.springmybatis.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminUserAction {

    @Autowired
    AdminUserService service;

    @RequestMapping("/queryAdminUserAll")
    public List<AdminUser> queryAdminUserAll(){
        List<AdminUser> users = service.queryAdminUserAll();
        System.out.println(users.size()+"------->");
        if(users == null){
            System.out.println("没有查询结果....");
        }
        for (AdminUser user: users) {
            System.out.println(user.getAccount()+"-----"+user.getAddress());
        }
        return users;
    }
}
