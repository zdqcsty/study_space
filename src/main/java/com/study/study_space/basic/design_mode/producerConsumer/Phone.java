package com.study.study_space.basic.design_mode.producerConsumer;

public class Phone {

    public int id;

    public Phone(int id){
        this.id=id;
    }
    @Override
    public String toString() {
        return  "手机编号       "+id;
    }
}
