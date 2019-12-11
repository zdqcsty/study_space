package com.study.study_space.bigdata.spark;

import org.apache.spark.launcher.SparkAppHandle;
import org.apache.spark.launcher.SparkLauncher;

import java.io.*;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

public class SparkLauncherDemo {

    public static void main(String[] args) throws IOException, InterruptedException {

        HashMap<String, String> map = new HashMap<>();
        map.put("HADOOP_CONF_DIR", "/opt/beh/core/hadoop/etc/hadoop");
        map.put("JAVA_HOME", "/opt/beh/core/jdk");

        CountDownLatch countDownLatch = new CountDownLatch(1);

        SparkLauncher launcher = new SparkLauncher(map);
        launcher.setSparkHome("/opt/beh/core/spark");
        launcher.setAppResource("/home/hadoop/zgh/spark_test-1.0-SNAPSHOT.jar");
        launcher.setMainClass("com.study.Spark_Test");
        launcher.setMaster("yarn");
        launcher.setConf(SparkLauncher.EXECUTOR_MEMORY, "4g");
        launcher.setConf(SparkLauncher.EXECUTOR_CORES, "2");

//        Process process = launcher.launch();

//        String line;

//        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
//        while ((line = br.readLine()) != null) {
//            System.out.println(line);
//        }

//        BufferedReader error = new BufferedReader(new InputStreamReader(process.getErrorStream()));
//        while ((line = error.readLine()) != null) {
//            System.out.println(line);
//        }

        SparkAppHandle sparkAppHandle = launcher.startApplication(new SparkAppHandle.Listener() {
            @Override
            public void stateChanged(SparkAppHandle handle) {
                if (handle.getState().isFinal()) {
                    countDownLatch.countDown();
                }
                System.out.println("state:" + handle.getState().toString());
            }
            @Override
            public void infoChanged(SparkAppHandle handle) {
            }
        });

        System.out.println("The task is executing, please wait ....");
        //线程等待任务结束
        countDownLatch.await();
        System.out.println("The task is finished!");

    }

}

