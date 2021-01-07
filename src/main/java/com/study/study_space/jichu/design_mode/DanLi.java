package com.study.study_space.jichu.design_mode;

public class DanLi {

    public static synchronized DanLi getDanli(){
        return SingleTon.instance;
    }

    //使用静态内部类的原因   静态内部类是随着静态内部类的使用然后加载的
    public static class SingleTon{
        private static final DanLi instance=new DanLi();
    }
}
