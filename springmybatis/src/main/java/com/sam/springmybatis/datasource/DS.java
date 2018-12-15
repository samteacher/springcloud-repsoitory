package com.sam.springmybatis.datasource;

/**
 * @description： 创建拦截设置数据源的注解
 * Created by wangji on 2017/8/21.
 */

import java.lang.annotation.*;

@Target({
    ElementType.METHOD,
    ElementType.TYPE
})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DS {

    String dataSource() default "";

}
