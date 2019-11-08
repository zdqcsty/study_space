package com.study.study_space.web.dao;

import com.study.study_space.web.eneity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> getUsers();

    List<User> findUserByLikeName(String name);

    List<User> paixu(@Param(value="age")String age);
}