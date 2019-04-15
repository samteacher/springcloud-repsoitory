package com.keke.generatordemo.service.impl;

import com.keke.generatordemo.dao.PersonMapper;
import com.keke.generatordemo.entity.Person;
import com.keke.generatordemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonMapper personMapper;

    @Override
    public Person selectByPrimaryKey(Integer id) {
        return personMapper.selectByPrimaryKey(id);
    }

}
