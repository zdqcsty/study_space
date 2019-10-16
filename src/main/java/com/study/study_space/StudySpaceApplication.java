package com.study.study_space;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.study.study_space.web.dao")
public class StudySpaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudySpaceApplication.class, args);
    }

}
