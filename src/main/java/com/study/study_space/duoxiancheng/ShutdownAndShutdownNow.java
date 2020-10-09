package com.study.study_space.duoxiancheng;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutdownAndShutdownNow {

    public static void main(String[] args) throws InterruptedException {

        final ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 100; i++) {
            executor.submit(new Ceshi());
        }
        //这一步的操作是让所有的任务进入等待队列
        Thread.sleep(2000);
//        executor.shutdown();
        //shutdownNow会中断所有正在执行的任务，清空等待队列
        executor.shutdownNow();
        System.out.println("hahah");
    }


    static class Ceshi implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
                System.out.println("heiheihei");
            } catch (InterruptedException e) {
            }
        }
    }
}
