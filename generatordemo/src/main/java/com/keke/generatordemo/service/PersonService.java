package com.keke.generatordemo.service;

import com.keke.generatordemo.entity.Person;

/**
 * @author Administrator
 */
public interface PersonService {

    Person selectByPrimaryKey(Integer id);

}
