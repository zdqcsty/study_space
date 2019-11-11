package com.study.study_space;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class StudySpaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudySpaceApplication.class, args);
    }

}
