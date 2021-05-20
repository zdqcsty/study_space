package com.study.study_space.jdbc;

import java.sql.*;

public class OracleJdbc {

    public static void main(String[] args) throws Exception {

        Class.forName("oracle.jdbc.OracleDriver");

        String url = "jdbc:oracle:thin:@172.16.14.135:1521/orcl";

        String sql = "select * from all_tab_columns  where TABLE_NAME = 'YANGTESTIMPUT02' AND OWNER ='ZXGH'";

//        String sql = "select * from all_tab_columns where TABLE_NAME = 'DEMOAAA' and OWNER = 'ZXGH'";

        try (Connection connect = DriverManager.getConnection(url, "audit_easy", "audit_easy");

             Statement statement = connect.createStatement();

             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                System.out.println(resultSet.getString("COLUMN_NAME"));
//                set.add(resultSet.getString("COLUMN_NAME"));
            }
        }
    }
}
