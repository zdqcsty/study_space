package com.study.study_space.duoxiancheng.synchroniz;

public class MyThread21_0 extends Thread
{
    private ThreadDomain21 td;

    public MyThread21_0(ThreadDomain21 td)
    {
        this.td = td;
    }

    public void run()
    {
        td.setUserNamePassword("A", "AA");
    }
}