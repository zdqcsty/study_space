package com.study.study_space.web.service;

import com.study.study_space.web.dao.UserMapper;
import com.study.study_space.web.eneity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers() {
        return userMapper.getUsers();
    }

    public List findUserByLikeName(){
        List<User> test = userMapper.findUserByLikeName("王");
        return test;
    }

    public List paixu(){
        List<User> test = userMapper.paixu("王蓉");
        return test;
    }

}
