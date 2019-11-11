package com.study.study_space.duoxiancheng;

import java.util.concurrent.TimeUnit;

public class StopThread {

    /**
     * 看下main方法  本以为主线程可以改变stopRequested  的值使线程关闭,其实不是的,  不加同步的话，不能保证后台线程
     * 何时能看到主线程对stopRequested  的更改
     *
     * 另外一种方法是 对stopRequested 添加  voliatle关键字
     */
    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {


        Thread backgroud =new Thread(() ->{
            int i=0;
            while(!stopRequested){
                i++;
                System.out.println(i);
            }
        });

        backgroud.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested=true;
    }


}
