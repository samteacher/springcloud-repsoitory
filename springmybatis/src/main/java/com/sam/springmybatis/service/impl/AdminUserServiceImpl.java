package com.sam.springmybatis.service.impl;

import com.sam.springmybatis.dao.AdminUserMapper;
import com.sam.springmybatis.entity.AdminUser;
import com.sam.springmybatis.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminUserServiceImpl implements AdminUserService {
	
	@Autowired
	private AdminUserMapper adminUserMapper;

	@Override
	public List<AdminUser> queryAdminUserAll() {
		return  adminUserMapper.queryAdminUserAll();
	}
}
