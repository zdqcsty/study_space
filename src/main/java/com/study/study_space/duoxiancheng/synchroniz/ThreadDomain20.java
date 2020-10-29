package com.study.study_space.duoxiancheng.synchroniz;

public class ThreadDomain20 {
    public synchronized void otherMethod() {
        System.out.println("----------run--otherMethod");
    }

    public void doLongTask() {
        synchronized (this) {
            for (int i = 0; i < 1000; i++) {
                System.out.println("synchronized threadName = " +
                        Thread.currentThread().getName() + ", i = " + (i + 1));
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
