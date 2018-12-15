package com.sam.springmybatis.service;

import com.sam.springmybatis.entity.AdminUser;

import java.util.List;

public interface AdminUserService {

	List<AdminUser> queryAdminUserAll();
	
}
