package com.gre.world.driver;

/**
 * @author 风骚的GRE
 * @Descriptions 定义一个数据库连接规范
 * @date 2018/6/30.
 */
public interface DataBaseDirver {
    public String connect(String host,int port) throws Exception;
}
