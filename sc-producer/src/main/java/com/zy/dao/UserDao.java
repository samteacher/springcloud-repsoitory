package com.zy.dao;

import com.zy.entity.User;
import com.zy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author Administrator
 */
@Component
public class UserDao {

    @Autowired
    private UserMapper userMapper;

    /**
     * @param id
     * @return
     */
    public User getUserById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }

    public void saveUser(User user){
        userMapper.insert(user);
    }

    public void updateUser(User user){
        userMapper.updateByPrimaryKey(user);
    }

    public int deletedById(Integer id){
        return userMapper.deleteByPrimaryKey(id);
    }
}
