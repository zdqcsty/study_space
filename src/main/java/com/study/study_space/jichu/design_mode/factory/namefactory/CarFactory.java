package com.study.study_space.jichu.design_mode.factory.namefactory;

public class CarFactory implements Factory {
    @Override
    public void make() {
        System.out.println("make a car");
    }
}