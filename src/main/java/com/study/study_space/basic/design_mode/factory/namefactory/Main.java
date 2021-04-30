package com.study.study_space.basic.design_mode.factory.namefactory;

public class Main {
    public static void main(String[] args){

        Factory carFactory=new CarFactory();
        carFactory.make();

        Factory bicycleFactory=new BicycleFactory();
        bicycleFactory.make();
    }

}
