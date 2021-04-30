package com.study.study_space.basic.design_mode.strategy;

public class SubtractStrategy implements Strategy {

    @Override
    public void doSomething(int a, int b) {
        System.out.println(a - b);
    }
}