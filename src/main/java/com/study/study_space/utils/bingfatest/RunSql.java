package com.study.study_space.utils.bingfatest;

import org.slf4j.Logger;

import java.sql.*;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

public class RunSql implements Runnable {

    private static Logger LOG = org.slf4j.LoggerFactory.getLogger(RunSql.class);

    private String driverName = "org.apache.hive.jdbc.HiveDriver";
    private String CONNECTION_URL;
    private String user;
    private String password;

    public AtomicReference<Exception> ex;
    public String sql;
    public Semaphore sem;

    public RunSql(AtomicReference<Exception> ex, Semaphore sem, String sql, String jdbcUrl, String user, String password) {
        this.ex = ex;
        this.sql = sql;
        this.sem = sem;
        this.CONNECTION_URL = jdbcUrl;
        this.user = user;
        this.password = password;
    }

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            System.exit(1);
        }
        try {
            connection = DriverManager.getConnection(CONNECTION_URL, user, password);
        } catch (SQLException throwables) {
            return null;
        }
        return connection;
    }


    @Override
    public void run() {
        Statement state = null;
        Connection conn = null;
        try {
            sem.acquire();
            conn = getConnection();
            state = conn.createStatement();
            double start = System.currentTimeMillis();
            ResultSet resultSet = state.executeQuery(sql);
            while (resultSet.next()) {
            }
            System.out.println(sql);
            double end = System.currentTimeMillis();
            LOG.info("execute sql " + sql + " cost time " + ((end - start) / 1000));
        } catch (Exception e) {
            ex.set(e);
        } finally {
            sem.release();
            try {
                if (state != null) {
                    conn.close();
                }
            } catch (SQLException e) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
            }
        }
    }
}
