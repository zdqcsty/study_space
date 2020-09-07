package com.study.study_space.jichu.utils;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {

    public static void main(String[] args) {

        List<String> list =new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(listToString(list));
    }

    //将List转为String，以指定的分隔符
    public static String listToString(List<String> list){
        return  String.join(",", list);
    }
}
