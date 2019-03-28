package com.sam.springmybatis.service.impl;

import com.sam.springmybatis.dao.UserMapper;
import com.sam.springmybatis.entity.User;
import com.sam.springmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUser(String job) {
        return userMapper.selectUser(job);
    }

    @Override
    public List<User> queryUserAll() {
        return userMapper.queryUserAll();
    }

}
