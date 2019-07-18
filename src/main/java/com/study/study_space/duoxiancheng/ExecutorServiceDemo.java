package com.study.study_space.duoxiancheng;

import java.util.concurrent.*;

public class ExecutorServiceDemo {

    public static ExecutorService executorService;

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Future<?>  future = executorService.submit(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //获取当前线程的名称
                String name = Thread.currentThread().getName();
                System.out.println(name);
                System.out.println("Asynchronous task");
            }
        });

        /**
         *  会等待线程计算的完成，在这里会阻塞
         */
        //future.get();

        /**
         * 调用shutdown(),ExecutorService 并不会马上关闭，而是不再接收新的任务，壹但所有的线程结束执行当前任务，ExecutorServie 才会真的关闭。
         */
        executorService.shutdown();
    }

    static {
        /**
         *newFixedThreadPool() 工厂方法创建壹個 ExecutorService ，上述代码创建了壹個可以容纳10個线程任务的线程池
         */
        // ExecutorService executorService = Executors.newFixedThreadPool(10);

        /**
         *  ExecutorService 的实现就是壹個线程池的实现。
         *  newFixedThreadPool() 工厂方法创建壹個 ExecutorService ，上述代码创建了壹個可以容纳10個线程任务的线程池
         *  重写了ThreadFactory()的newThread()  可以设置线程名称等操作
         */
         executorService = Executors.newFixedThreadPool(10, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setName("zeng");
                return t;
            };
        });
    }

}
