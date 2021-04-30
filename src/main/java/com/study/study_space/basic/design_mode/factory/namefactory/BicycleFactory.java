package com.study.study_space.basic.design_mode.factory.namefactory;

public class BicycleFactory implements Factory {
    @Override
    public void make() {
        System.out.println("make a Bicycle");
    }

}