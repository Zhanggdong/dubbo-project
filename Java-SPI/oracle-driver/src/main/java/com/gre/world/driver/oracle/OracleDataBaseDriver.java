package com.gre.world.driver.oracle;

import com.gre.world.driver.DataBaseDirver;

/**
 * @author 风骚的GRE
 * @Descriptions TODO
 * @date 2018/6/30.
 */
public class OracleDataBaseDriver implements DataBaseDirver {
    @Override
    public String connect(String host, int port) throws Exception {
        return "Oracle connecting host:"+host+" and por:"+port;
    }
}
