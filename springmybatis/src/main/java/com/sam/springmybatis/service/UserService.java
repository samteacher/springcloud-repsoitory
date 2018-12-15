package com.sam.springmybatis.service;

import com.sam.springmybatis.entity.User;

import java.util.List;

public interface UserService {

    List<User> getUser(String job);

    List<User> queryUserAll();
}
