package com.study.study_space.basic.design_mode.producerConsumer;

public class Producer implements Runnable{

    private Storage storage;

    public Producer(Storage storage){
        this.storage=storage;
    }
    @Override
    public void run() {
        for (int i=0;i<20;i++){
            try {
                storage.product(new Phone(i));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
