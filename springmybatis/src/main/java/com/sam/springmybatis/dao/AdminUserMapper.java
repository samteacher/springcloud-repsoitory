package com.sam.springmybatis.dao;

import com.sam.springmybatis.datasource.DS;
import com.sam.springmybatis.entity.AdminUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminUserMapper {

    @DS(dataSource = "dataSourceSamlog")
    List<AdminUser> queryAdminUserAll();
}
