package com.sam.springmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminUser {

    private Integer id;

    private String username;

    private String account;

    private String password;

    private Date createTime;

    private Date updateTime;

    private String email;

    private String telephone;

    private Integer age;

    private String address;

    private Date birthday;

    private String handerPic;

    private Integer isDelete;

    private Integer male;

    private Integer forbidden;

}
