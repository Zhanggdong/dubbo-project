package com.vivo.dubbo.user.bootstrap;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author zhangguidong
 * @Descriptions TODO
 * @date 2018/7/1.
 */
public class SPIBootstrap {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"META-INF/spring/provider.xml"});
        context.start();
//        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("myProtocol");
//        System.out.println(protocol.getDefaultPort());
//        // press any key to exit
        Protocol protocol2 = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();

        System.out.println(ExtensionLoader.getExtensionLoader(Protocol.class).getDefaultExtension().getDefaultPort());
        System.in.read();
    }
}
