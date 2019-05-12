package com.vivo.dubbo.user;

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
