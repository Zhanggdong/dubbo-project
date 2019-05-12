package com.vivo.dubbo.user.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.rpc.Exporter;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Protocol;
import com.alibaba.dubbo.rpc.RpcException;

/**
 * @author zhangguidong
 * @Descriptions TODO
 * @date 2018/7/1.
 */
public class MyProtocol implements Protocol
{
    @Override
    public int getDefaultPort() {
        return 8888;
    }

    @Override
    public <T> Exporter<T> export(Invoker<T> invoker) throws RpcException {
        return null;
    }

    @Override
    public <T> Invoker<T> refer(Class<T> aClass, URL url) throws RpcException {
        return null;
    }

    @Override
    public void destroy() {

    }
}
