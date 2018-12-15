package org.sang.action;

import org.sang.service.DemoService;
import org.sang.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by sang on 17-1-6.
 */
@RestController
public class CacheController {
    @Autowired
    DemoService demoService;

    /**
     * 以下四个是JPA的增删查改
     *
     * @return
     */
    @RequestMapping("/queryAll")
    public List<Person> queryAll() {
        return demoService.queryAll();
    }

    @RequestMapping("/put")
    public Person put(Person person) {
        return demoService.save(person);
    }

    @RequestMapping("/able")
    public Person cacheable(Person person) {
        return demoService.findOne(person);
    }

    @RequestMapping("/evit")
    public String evit(Long id) {
        demoService.remove(id);
        return "ok";
    }

    /**
     * 下面两个是数据库事务
     *
     * @param person
     * @return
     */
    @RequestMapping(value = "/norollback", produces = "text/plain;charset=UTF-8")
    public Person noRollback(Person person) {
        return demoService.savePersonWithoutRollBack(person);
    }

    @RequestMapping(value = "/rollback", produces = "text/plain;charset=UTF-8")
    public Person rollback(Person person) {
        return demoService.savePersonWithRollBack(person);
    }

}
