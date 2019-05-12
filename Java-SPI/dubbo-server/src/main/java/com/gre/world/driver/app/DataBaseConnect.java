package com.gre.world.driver.app;

import com.gre.world.driver.DataBaseDirver;
import com.gre.world.driver.mysql.MysqlDataBaseDriver;
import com.gre.world.driver.oracle.OracleDataBaseDriver;

import java.util.ServiceLoader;

/**
 * @author 风骚的GRE
 * @Descriptions TODO
 * @date 2018/6/30.
 */
public class DataBaseConnect {
    public static void main(String[] args) throws Exception {
        ServiceLoader<DataBaseDirver> dataBaseDirvers = ServiceLoader.load(DataBaseDirver.class);
        for (DataBaseDirver dirver:dataBaseDirvers){
            if (dirver instanceof OracleDataBaseDriver){
                System.out.println(dirver.connect("127.0.0.1",1521));
                continue;
            }
            if (dirver instanceof MysqlDataBaseDriver){
                System.out.println(dirver.connect("127.0.0.1",3306));
                continue;
            }
        }
    }
}
