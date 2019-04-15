package com.sam.excel.dao;

import com.sam.excel.entity.Membership_user_info;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Administrator
 */
@Repository
public interface MembershipUserInfoMapper {

    List<Membership_user_info> saveExcel();
}
