package com.study.study_space.duoxiancheng;

public class DeadLock {

    public static void main(String[] args) {

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                function1();
            }
        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                function2();
            }
        });

        thread1.start();
        thread2.start();
    }


    public static void function1(){
        synchronized (String.class){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("调用String");
            synchronized (Integer.class){
                System.out.println("调用Integer");
            }
        }
    }

    public static void function2(){
        synchronized (Integer.class){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("调用Integer");
            synchronized (String.class){
                System.out.println("调用String");
            }
        }
    }



}
