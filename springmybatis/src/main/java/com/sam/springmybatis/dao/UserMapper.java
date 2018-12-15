package com.sam.springmybatis.dao;

import com.sam.springmybatis.datasource.DS;
import com.sam.springmybatis.entity.AdminUser;
import com.sam.springmybatis.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @DS(dataSource = "dataSourceLibrary")
    List<User> selectUser(String job);

    @DS(dataSource = "dataSourceLibrary")
    List<User> queryUserAll();

    @DS(dataSource = "dataSourceSamlog")
    List<AdminUser> queryAdminUserAll();

}
