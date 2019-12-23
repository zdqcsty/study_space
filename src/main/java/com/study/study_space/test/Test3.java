package com.study.study_space.test;

import org.springframework.stereotype.Component;

public class Test3 {
    public void sayHello(){
        System.out.println("TestBean sayHello...");
    }

    public void start(){
        System.out.println("TestBean 初始化。。。");
    }

    public void cleanUp(){
        System.out.println("TestBean 销毁。。。");
    }

}
