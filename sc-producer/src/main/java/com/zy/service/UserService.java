package com.zy.service;

import com.zy.entity.User;

/**
 * @author Administrator
 */
public interface UserService {

    /**
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * @param user
     */
    void saveOrUpdateUser(User user);

    int deleteById(Integer id);
}
