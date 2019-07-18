package com.study.study_space.db.postgre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {


    public static void main(String[] args) {

        String insertSql = "insert into demo values(?,?,?);";
        executeUpdate(insertSql,"2","3",1);
        System.out.println("=============");

    }

    public static void executeUpdate(String sql, Object ...args ){
        PreparedStatement stmt = null;
        Connection conn = tobx();
        List<Map<String,String>> result = new ArrayList<>();
        try {
            stmt = conn.prepareStatement(sql);
            for(int i=0;i<args.length;i++){
                if(args[i] instanceof String) {
                    stmt.setString(i+1,args[i].toString());
                }else if(args[i] instanceof Integer){
                    stmt.setInt(i+1,Integer.parseInt(args[i].toString()));
                }else {
                    stmt.setObject(i+1,args[i]);
                }
            }
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(stmt != null) try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static Connection tobx(){
        String driver ="org.postgresql.Driver";
        String url = "jdbc:postgresql://192.168.6.1:5432/guanghao";
        String username = "postgres";
        String password = "password";
        return conn(url,driver,username,password);
    }

    public static Connection conn(String url,String driver,String username,String password){
        Connection conn = null;
        try {
            if(conn == null || conn.isClosed()){
                Class.forName(driver).newInstance();
                DriverManager.setLoginTimeout(5);
                conn = DriverManager.getConnection(url, username, password);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return conn;
        }
    }



}

