package com.awe.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Integer userId;

    private Integer deptId;

    private String userName;

    private String nickName;

    private String userType;

    private String email;

    private String phoneNumber;

    private String sex;

    private String avatar;

    private String password;

    private String status;

    private String elFlag;

    private String loginIp;

    private Date loginDate;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String remark;
}

