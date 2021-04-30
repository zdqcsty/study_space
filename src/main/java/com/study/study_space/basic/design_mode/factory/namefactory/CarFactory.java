package com.study.study_space.basic.design_mode.factory.namefactory;

public class CarFactory implements Factory {
    @Override
    public void make() {
        System.out.println("make a car");
    }
}