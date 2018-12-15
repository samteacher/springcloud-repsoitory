package com.sam.eurekaproperties.controller;

import com.sam.eurekaproperties.core.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//第一种方法
//@PropertySource(value = "classpath:config/sam.properties",ignoreResourceNotFound=false,encoding="UTF-8")
public class EnvirController {

    @Autowired
    private Environment enr;

    //第二种
    @Autowired
    private MyConfig myConfig;

    @RequestMapping(value = "/getEnvironment",produces="text/html;charset=UTF-8")
    @Value("${samteacher.name}")  //第三种方法
    public String getEnvirController(){
        //System.out.println(enr.getProperty("samteacher.username"));
        //return enr.getProperty("samteacher.username")+"==="+enr.getProperty("samteacher.password");
        //return enr.getProperty("sam.info.name")+"==="+enr.getProperty("sam.info.version")+"===="+enr.getProperty("sam.info.descrition");
        return myConfig.getName()+"==="+myConfig.getVersion()+"===="+myConfig.getDescrition();
    }

}
