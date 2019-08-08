package com.study.study_space.jichu.exception;

import java.io.IOException;

public class Test1 {

    public static void main(String[] args){

        getExceptionLog();
    }

    public static void getExceptionLog(){

        try {
            throw new IOException();
        } catch (IOException e) {
            //printStackTrace  和  toString  打印日志的详细程度不同
            e.printStackTrace();
            System.out.println("-------------------------------------");
            System.out.println(e.toString());
            System.out.println("-------------------------------------");
            //看源码知道  因为这里没有有参的构造函数初始化 message  所以这里为null
            String message = e.getMessage();
            System.out.println(message);
        }

        //将异常catch以后  后面的代码可以继续执行
        System.out.println("hahaha");
    }
}
