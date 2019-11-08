package com.study.study_space.test;


public class MainTest {
    public static void main(String[] args) {
        ObjectService service=new ObjectService();
        ObjectService service1=new ObjectService();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(service1);
        b.setName("B");
        b.start();
    }
}