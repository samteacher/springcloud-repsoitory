package com.keke.generatordemo.dao;

import com.keke.generatordemo.entity.Person;

/**
 * @author Administrator
 */
public interface PersonMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);

}