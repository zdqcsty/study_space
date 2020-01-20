package com.study.study_space.jichu.design_mode.producerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class aaa {


    public static BlockingQueue<String> taskQueue = new ArrayBlockingQueue<String>(5);

    public static void main(String[] args) {
        consumerAndProducer();
    }

    public static  void consumerAndProducer(){

        new Thread(){
            @Override
            public void run() {
                for (int i=0;i<200;i++) {
                    try {
                        taskQueue.put(String.valueOf(i));
                        System.out.println(i+"-----------生产者");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(3000);
                        String take = taskQueue.take();
                        System.out.println(take + "-----------------消费者");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

    }


}
