package com.study.study_space.basic.design_mode.factory.easy_factory;

public class Factory {

    public Transport make(String str) {
        switch (str) {
            case "bicycle":
                return new Bicycle();

            case "car":
                return new Car();

            default:
                break;
        }
        return null;
    }

    public static void main(String[] args) {
        Factory factory = new Factory();
        Transport bicycle = factory.make("bicycle");
        bicycle.run();
        Transport car = factory.make("car");
        car.run();
    }
}
