package com.sam.eurekaexception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * spring boot 异常处理
 */
@Controller
@RequestMapping("/error")
public class MyErrorController implements ErrorController {

    private static final Logger log = LoggerFactory.getLogger(MyErrorController.class);

    @Override
    public String getErrorPath() {
        log.info("出错了，你进入了自定义错误控制器.....");
        return "error/error";
    }

    @RequestMapping
    public String error(){
        return getErrorPath();
    }
}
