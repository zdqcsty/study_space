package com.study.study_space.basic.collection;

import java.util.*;

public class List2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Collections.addAll(list, "one", "two", "three", "four", "five");

//        String[] strings = list.toArray(new String[0]);
//        System.out.println(Arrays.toString(strings));
//
//        list.addAll(3,list);//在下表3的位置插入容器
//        boolean one = list.contains("one");//是否包含其中元素

//        List<String> list1= new ArrayList<>();
//        Collections.addAll(list,"one","two","three");
//        boolean b = list.retainAll(list1);
//        System.out.println(b);

//        ListIterator<String> stringListIterator = list.listIterator(3);//从哪个位置开始读取元素
        ListIterator<String> stringListIterator = list.listIterator();//从哪个位置开始读取元素
        stringListIterator.add("eight");

        System.out.println(list);
//        while(stringListIterator.hasNext()){
//            stringListIterator.next()
//        }

    }

}
