package org.sang.service;

import org.sang.entity.Person;

import java.util.List;

/**
 * Created by sang on 17-1-6.
 */
public interface DemoService {

    Person save(Person person);

    void remove(Long id);

    Person findOne(Person person);

    List<Person> queryAll();

    Person savePersonWithRollBack(Person person);

    Person savePersonWithoutRollBack(Person person);

}
