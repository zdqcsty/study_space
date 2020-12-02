package com.study.study_space.jichu.design_mode.factory.namefactory;

public class Main {
    public static void main(String[] args){

        Factory carFactory=new CarFactory();
        carFactory.make();

        Factory bicycleFactory=new BicycleFactory();
        bicycleFactory.make();
    }

}
