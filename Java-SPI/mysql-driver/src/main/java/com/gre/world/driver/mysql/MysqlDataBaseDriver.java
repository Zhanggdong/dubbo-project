package com.gre.world.driver.mysql;

import com.gre.world.driver.DataBaseDirver;

/**
 * @author 风骚的GRE
 * @Descriptions MySQL实现的规范
 * @date 2018/6/30.
 */
public class MysqlDataBaseDriver implements DataBaseDirver{
    @Override
    public String connect(String host, int port) throws Exception {
        return "MySQL connecting host:"+host+" and por:"+port;
    }
}
