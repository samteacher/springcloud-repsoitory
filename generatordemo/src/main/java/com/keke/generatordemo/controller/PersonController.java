package com.keke.generatordemo.controller;

import com.keke.generatordemo.entity.Person;
import com.keke.generatordemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/generator/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/select")
    public Person select(Integer id) {
        return personService.selectByPrimaryKey(id);
    }

}
