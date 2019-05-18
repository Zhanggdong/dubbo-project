package com.vivo.dubbo.client;

import com.vivo.dubbo.user.IUserService;

/**
 * @author 风骚的GRE
 * @Descriptions TODO
 * @date 2018/6/30.
 */
public class TestMock implements IUserService {
    @Override
    public String sayHello(String s) {
        return "系统繁忙，请稍后再试！";
    }
}
