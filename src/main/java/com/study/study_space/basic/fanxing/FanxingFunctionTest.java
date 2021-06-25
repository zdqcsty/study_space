package com.study.study_space.basic.fanxing;

public class FanxingFunctionTest {

    public static void main(String[] args) {
        //创建对象
        FanxingFunctionTest function = new FanxingFunctionTest();

        //调用方法,传入的参数是什么类型,返回值就是什么类型
        function.show("hello");
        function.show(12);
        function.show(12.5);
    }

    //定义泛型方法..s
    public <T> T show(T t) {
        System.out.println(t);
        return t;
    }

}
