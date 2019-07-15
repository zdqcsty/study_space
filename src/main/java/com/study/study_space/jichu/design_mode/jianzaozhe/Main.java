package com.study.study_space.jichu.design_mode.jianzaozhe;


public class Main {

    public static void main(String[] args){

        Builder builder=new Abuilder();
        Director director=new Director(builder);
        Computer computer = director.buildComputer("机械键盘", "i5", "8G", "罗技");
        System.out.println(computer);
    }

}