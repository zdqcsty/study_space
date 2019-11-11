package com.study.study_space.jichu.exception;

import java.io.IOException;

public class RuntimeExceptionDemo{

    public static void main(String[] args) {

//        ceshiException();
        demo1();
    }


    public static void ceshiException(){

        /**
         * 一般自定义异常都要集成RuntimeException   这样的话不需要在方法上去做声明   而且也能统一的抛出
         */
        throw new ScriptException("hahahha");
    }

    public static  void  demo1(){

        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }



}
