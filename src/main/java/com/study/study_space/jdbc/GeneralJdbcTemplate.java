package com.study.study_space.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GeneralJdbcTemplate {

    private static String driverName = "org.apache.hive.jdbc.HiveDriver";
    private static String CONNECTION_URL = "jdbc:hive2://10.248.8.17:10001/hive";

    public static void main(String[] args) throws SQLException, IOException, InterruptedException {

        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }

        Connection connection = DriverManager.getConnection(CONNECTION_URL, "hadoop", "");

        ResultSet resultSet = connection.prepareStatement("select * from vbapffba9dca5df44dc088cc151ee4e69f91_7 limit 10").executeQuery();
        while (resultSet.next()) {
            String str = resultSet.getString(1);
            System.out.println(str);
        }
        connection.close();
    }

}
