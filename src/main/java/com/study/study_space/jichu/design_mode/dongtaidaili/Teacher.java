package com.study.study_space.jichu.design_mode.dongtaidaili;

public class Teacher implements com.example.ceshi.test.dongtaidaili.People {

    @Override
    public String work(String name) {
        System.out.println("老师教书育人...");
        return "教书";
    }
}