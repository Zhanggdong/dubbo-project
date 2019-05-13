package com.vivo.dubbo.user.dal.entity;

import lombok.Data;

import java.util.Date;

/**
* 
* @Description: TODO 
* @ClassName: User
* @ProjectName dubbo-user
* @author zhangguidong
* @date 2019/5/10 17:29
* @version 1.0.0
*/
@Data
public class User {
    private Integer id;

    private String username;

    private String password;

    private String realname;

    private String avatar;

    private String mobile;

    private String sex;

    private Integer status;

    private Date createTime;
}
