package com.vivo.dubbo.user.service;

import com.vivo.dubbo.user.IUserService;

/**
 * @author zhangguidong
 * @Descriptions TODO
 * @date 2018/6/26.
 */
public class UserServiceImpl2 implements IUserService {
    @Override
    public String sayHello(String msg) {
        return "Vesion2:Hello,"+msg;
    }
}
