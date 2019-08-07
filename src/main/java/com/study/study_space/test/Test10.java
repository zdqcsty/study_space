package com.study.study_space.test;

import java.util.concurrent.ThreadLocalRandom;

public class Test10 {


    public static void main(String[] args) {


//        System.out.println(ThreadLocalRandom.current().nextInt(2));

        Integer a=new Integer(6);
        Integer b=new Integer(6);

        System.out.println(a==b);
    }


    public static  void demo(){
        try {
            int test = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getStackTrace().toString());
        }

    }

}
