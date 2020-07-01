package com.study.study_space.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrestoJdbc {

    private static String CONNECTION_URL = "jdbc:presto://10.130.7.204:16001/dev001/devtest";

    public static void main(String[] args) throws SQLException{

        Connection connection = DriverManager.getConnection(CONNECTION_URL, "hadoop", "");

        ResultSet resultSet = connection.prepareStatement("select * from deoiuytdemo").executeQuery();

        while (resultSet.next()) {
            String str = resultSet.getString(1);
            System.out.println(str);
        }

        connection.close();
    }

}
