package com.study.study_space.test;

public class ThreadB extends Thread {
    private ObjectService objectService;

    public ThreadB(ObjectService objectService) {
        super();
        this.objectService = objectService;
    }
    @Override
    public void run() {
        objectService.setUserNamePassWord("b", "bb");
    }
}
