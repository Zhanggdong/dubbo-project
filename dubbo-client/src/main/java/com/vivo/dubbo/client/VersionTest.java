package com.vivo.dubbo.client;

import com.vivo.dubbo.user.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class VersionTest
{
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"MATE-INF/spring/consumer-version.xml"});
        context.start();
        // obtain proxy object for remote invocation
        IUserService demoService = (IUserService) context.getBean("userService");
        // execute remote invocation
        String hello = demoService.sayHello("world");
        // show the result
        System.out.println(hello);
        System.in.read();
    }
}
