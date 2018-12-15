package com.zy.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zy.entity.User;
import com.zy.service.UserService;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;

/**
 * @author Administrator
 */
@RestSchema(schemaId = "user")
//@RestController
@RequestMapping(path = "/index",produces = MediaType.APPLICATION_JSON)
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "getUserById", method = RequestMethod.GET)
    public String getUserById(Integer id){
        System.out.println("------------>" + id);
        User user = userService.getUserById(id);
        return user.getName();
    }

    @RequestMapping(path = "saveOrUpdateUser", method = RequestMethod.POST)
    public String saveOrUpdateUser(@RequestBody User user){
        userService.saveOrUpdateUser(user);
        return "OK";
    }

    @RequestMapping(path = "deleteById", method = RequestMethod.POST)
    public String deleteById(          Integer id){
        Integer result = userService.deleteById(id);
        return result == 1 ? "OK" : "NO";
    }


}
