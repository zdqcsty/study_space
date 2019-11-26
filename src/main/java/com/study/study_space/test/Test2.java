package com.study.study_space.test;

import io.netty.channel.local.LocalAddress;

import java.io.IOException;
import java.net.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test2 {

    public static void main(String[] args) throws ParseException, IOException {

        Map<String,String> ceshi=new HashMap<>();

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"aaa");
        map.put(2,"bbb");
        map.put(3,"ccc");

        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext()){

            for(String aaa:ceshi.keySet()){
                if (iterator.next().toString().equals(aaa)){
                    System.out.println("hello world");
                }
            }
        }
    }
}
