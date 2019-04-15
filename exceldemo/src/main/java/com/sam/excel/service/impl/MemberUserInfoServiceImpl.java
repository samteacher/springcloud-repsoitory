package com.sam.excel.service.impl;

import com.sam.excel.dao.MembershipUserInfoMapper;
import com.sam.excel.entity.Membership_user_info;
import com.sam.excel.service.MemberUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class MemberUserInfoServiceImpl implements MemberUserInfoService {

    @Autowired
    MembershipUserInfoMapper membershipUserInfoMapper;

    @Override
    public List<Membership_user_info> saveExcel() {
        return membershipUserInfoMapper.saveExcel();
    }
}
