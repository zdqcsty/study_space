package com.study.study_space.jdbc;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.StringJoiner;

public class MysqlDemo {

    public static String CONNECTION_URL = "jdbc:mysql://localhost:3306/ceshi?useUnicode=true&characterEncoding=utf8&autoReconnect=true&rewriteBatchedStatements=TRUE";

    public static void main(String[] args) throws SQLException, FileNotFoundException {

        Connection connection = DriverManager.getConnection(CONNECTION_URL,"root","root");

        ResultSet resultSet = connection.prepareStatement("select * from products").executeQuery();

        PrintWriter pw=new PrintWriter("E:\\a.txt");
        //将结果拼接到一起弄成csv
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        while (resultSet.next()) {
            StringJoiner fieldInfo = new StringJoiner(",");
            for(int i=1;i<=columnCount;i++){
                String field = resultSet.getString(i);
                if (field==null){
                    field="";
                }
                fieldInfo.add(field);
            }
            pw.println(fieldInfo.toString());
        }
        pw.close();

    }

}
