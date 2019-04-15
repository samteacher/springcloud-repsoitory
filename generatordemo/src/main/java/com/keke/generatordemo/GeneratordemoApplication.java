package com.keke.generatordemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan(basePackages = "com.keke.generatordemo.dao")
public class GeneratordemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeneratordemoApplication.class, args);
    }

}
