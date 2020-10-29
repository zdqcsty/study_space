package com.study.study_space.duoxiancheng.synchroniz;

public class MyThread21_main {

    public static void main(String[] args) throws InterruptedException {
        ThreadDomain21 td = new ThreadDomain21();
        ThreadDomain21 td1 = new ThreadDomain21();
        MyThread21_0 mt0 = new MyThread21_0(td);
        MyThread21_1 mt1 = new MyThread21_1(td1);
        mt0.start();
        Thread.sleep(1000);
        mt1.start();
    }

}
