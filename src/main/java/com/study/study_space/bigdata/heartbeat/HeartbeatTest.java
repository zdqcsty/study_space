package com.study.study_space.bigdata.heartbeat;

import java.io.IOException;

public class HeartbeatTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    ServiceCenter serviceServer = ServiceCenter.getInstance();
                    serviceServer.register(com.example.ceshi.test.heartbeat.HeartbeatHandler.class, com.example.ceshi.test.heartbeat.HeartbeatHandlerImpl.class);
                    serviceServer.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        Thread client1 = new Thread(new com.example.ceshi.test.heartbeat.HeartbeatClient());
        client1.start();
        Thread client2 = new Thread(new com.example.ceshi.test.heartbeat.HeartbeatClient());
        client2.start();
    }
}
