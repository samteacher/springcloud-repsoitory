package com.sam.springmybatis.action;

import com.sam.springmybatis.entity.User;
import com.sam.springmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserAction {

    @Autowired
    UserService service;

    @RequestMapping("/selectAllUser")
    public List<User> selectAllUser(String job){
        List<User> users = service.getUser(job);
        if(users == null){
            System.out.println("没有查询结果....");
        }
        for (User user: users) {
            System.out.println(user.getAccount()+"-----"+user.getAddress());
        }
        return users;
    }

    @RequestMapping("/queryUserAll")
    public List<User> queryUserAll(){
        List<User> users = service.queryUserAll();
        System.out.println(users.size()+"------->");
        if(users == null){
            System.out.println("没有查询结果....");
        }
        for (User user: users) {
            System.out.println(user.getAccount()+"-----"+user.getAddress());
        }
        return users;
    }
}
