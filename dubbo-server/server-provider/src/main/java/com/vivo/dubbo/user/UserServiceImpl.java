package com.vivo.dubbo.user;

/**
 * @author zhangguidong
 * @Descriptions TODO
 * @date 2018/6/26.
 */
public class UserServiceImpl implements IUserService {
    @Override
    public String sayHello(String msg) {
        return "Cluster1:Hello,"+msg;
    }
}
