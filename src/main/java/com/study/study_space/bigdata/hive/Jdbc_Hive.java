package com.study.study_space.bigdata.hive;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.security.UserGroupInformation;

import java.io.IOException;
import java.sql.*;

public class Jdbc_Hive {


    private static String driverName = "org.apache.hive.jdbc.HiveDriver";
    private static String CONNECTION_URL ="jdbc:hive2://133.95.16.3:10000/nokia_sd_db;principal=hive/hivecluster@BCHKDC";

    public static void main(String[] args) throws SQLException, IOException {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }

        System.out.println("测试内容");

        //登录Kerberos账号
        Configuration configuration = new Configuration();
        UserGroupInformation.setConfiguration(configuration);
        UserGroupInformation.loginUserFromKeytab("nokia_sd@BCHKDC", "/opt/beh/metadata/key/super.keytab");

        Connection connection = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        long flag = 0;
        connection = DriverManager.getConnection(CONNECTION_URL);
    }
}
