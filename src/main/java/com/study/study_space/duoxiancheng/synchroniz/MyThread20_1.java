package com.study.study_space.duoxiancheng.synchroniz;

public class MyThread20_1 extends Thread {
    private ThreadDomain20 td;

    public MyThread20_1(ThreadDomain20 td) {
        this.td = td;
    }

    public void run() {
        td.otherMethod();
    }
}