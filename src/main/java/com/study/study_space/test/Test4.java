package com.study.study_space.test;

import java.io.*;
import java.util.Date;
import java.util.HashSet;

public class Test4 {

    public static void main(String[] args) throws IOException {

       /* String aaa="mapred.input.dir.recursive=true";
        for (String hiveConf : aaa.split("=")) {
            String bbb ="SET " + hiveConf;
            System.out.println(bbb);
        }
        */


        long timestamp = new Date().getTime();
        System.out.println(timestamp);

        BufferedReader bf=new BufferedReader(new FileReader("aaa"));
        bf.close();
    }

}
