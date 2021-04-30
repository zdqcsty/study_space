package com.study.study_space.basic.design_mode.proxy;

public class DailiProxy implements DaiLiInterFace {

    private Daili daili;

    public DailiProxy(Daili daili) {
        this.daili = daili;
    }

    @Override
    public void proxy() {
        System.out.println("is be proxying");
        daili.proxy();
    }

    public static void main(String[] args) {

        Daili daili=new Daili();
        DailiProxy proxy=new DailiProxy(daili);
        proxy.proxy();


    }

}
