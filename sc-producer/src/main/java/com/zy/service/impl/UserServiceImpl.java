package com.zy.service.impl;

import com.zy.dao.UserDao;
import com.zy.entity.User;
import com.zy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public void saveOrUpdateUser(User user) {
        if(null == user.getId()){
            userDao.saveUser(user);
        }else{
            userDao.updateUser(user);
        }
    }

    @Override
    public int deleteById(Integer id) {
        return userDao.deletedById(id);
    }
}
