package com.vivo.dubbo.user.bootstrap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author zhangguidong
 * @Descriptions Dubbo 服务端启动类
 * @date 2018/6/26.
 */
public class ProtocolBootstrap {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"META-INF/spring/provider-protocol.xml"});
        context.start();
        // press any key to exit
        System.in.read();
    }
}
