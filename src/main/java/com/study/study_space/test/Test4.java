package com.study.study_space.test;

import java.util.Date;

public class Test4 {

    public static void main(String[] args) {

       /* String aaa="mapred.input.dir.recursive=true";
        for (String hiveConf : aaa.split("=")) {
            String bbb ="SET " + hiveConf;
            System.out.println(bbb);
        }
        */


        long timestamp = new Date().getTime();
        System.out.println(timestamp);

    }

}
