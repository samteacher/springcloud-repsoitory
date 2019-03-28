package com.sam.springmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;

    private String username;

    private String age;

    private String password;

    private String account;

    private String address;

    private String male;

    private String job;

}
