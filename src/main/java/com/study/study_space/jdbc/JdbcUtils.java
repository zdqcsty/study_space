package com.study.study_space.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {

    private static final String DRIVER_NAME = "org.apache.hive.jdbc.HiveDriver";
    private static final String CONNECTION_URL = "jdbc:hive2://10.248.8.17:10001/hive";

    public static Connection getConn(){
        try {
            Class.forName(DRIVER_NAME);
            return DriverManager.getConnection(CONNECTION_URL,"hadoop","");
        } catch (Exception e) {
            throw new RuntimeException("获取连接失败",e);
        }
    }


}
