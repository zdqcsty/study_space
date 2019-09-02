package com.study.study_space.jichu.design_mode.celue;

public class SubtractStrategy implements Strategy {

    @Override
    public void doSomething(int a, int b) {
        System.out.println(a-b);
    }
}