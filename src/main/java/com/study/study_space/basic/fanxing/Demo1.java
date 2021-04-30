package com.study.study_space.basic.fanxing;

public class Demo1 {

    public static void main(String[] args) {


        StringBuilder sb=new StringBuilder();
        sb.append("aaa");
        System.out.println(sb.toString());
    }

    public static  void getStr(String str){
//        String s = Objects.requireNonNull(str);
        if (str==null){
            throw new NullPointerException();
        }

        System.out.println(str);
    }

}
