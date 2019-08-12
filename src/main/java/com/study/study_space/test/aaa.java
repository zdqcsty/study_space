package com.study.study_space.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class aaa {

    public static void main(String[] args) {

        ThreadLocal t=new ThreadLocal();
        t.set("aaa");

//        ThreadLocal<SimpleDateFormat>  format2  = new ThreadLocal<SimpleDateFormat>(){
//            protected SimpleDateFormat initialValue() {
//                SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                return f;
//            }
//        };



         Object object=new Object(){};

        ArrayList<String> list = new ArrayList<String>() {{}};



    }

}
