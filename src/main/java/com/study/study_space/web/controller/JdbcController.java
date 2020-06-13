package com.study.study_space.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Controller
public class JdbcController {

    @Autowired
    private DataSource dataSource;

    @ResponseBody
    @RequestMapping("/testHikari")
    public String test() {

        Connection connection=null;
        try {
            connection = dataSource.getConnection();
            ResultSet resultSet = connection.prepareStatement("select count(*) from products").executeQuery();
            String str="";
            while (resultSet.next()){
                str = resultSet.getString(1);
            }
            connection.close();
            return str;
        } catch (SQLException e) {
        }

        return "";
    }

}
