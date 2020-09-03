package com.study.study_space.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.*;

public class GeneralGetDatabaseAndTable {

    private static String driverName = "org.apache.hive.jdbc.HiveDriver";
    private static String CONNECTION_URL = "jdbc:hive2://10.130.7.208:10000/ceshi";

    public static void main(String[] args) throws Exception {

        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        Connection connection = DriverManager.getConnection(CONNECTION_URL,"hadoop","");

        DatabaseMetaData metaData = connection.getMetaData();

        //获取数据库
        ResultSet catalogs = metaData.getSchemas();
        while (catalogs.next()){
            System.out.println(catalogs.getString(1));
        }

        //获取ceshi database下面的表（通用方式）
        ResultSet angie_test = metaData.getTables(catalogs.toString(), "ceshi", "%", new String[]{"TABLE","VIEW"});
        while (angie_test.next()){
            String str = angie_test.getString(3);
            System.out.println(str);
        }
        connection.close();
    }

}
