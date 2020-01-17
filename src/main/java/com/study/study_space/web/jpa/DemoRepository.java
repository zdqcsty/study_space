package com.study.study_space.web.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource (path="user")   //Spring Data REST是基于Spring Data的repository之上，可以把 repository 自动输出为REST资源
public interface DemoRepository extends JpaRepository<User,String> {

     User findByAge(@Param("age") String age);
}