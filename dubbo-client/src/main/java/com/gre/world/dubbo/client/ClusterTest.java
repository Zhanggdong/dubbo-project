package com.gre.world.dubbo.client;

import com.gre.world.dubbo.user.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class ClusterTest
{
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"MATE-INF/spring/consumer.xml"});
        context.start();
        // obtain proxy object for remote invocation
        for (int i=0;i<10;i++) {
            IUserService demoService = (IUserService) context.getBean("userService");
            // execute remote invocation
            String hello = demoService.sayHello("world");
            // show the result
            System.out.println(hello);
        }
        System.in.read();
    }
}
