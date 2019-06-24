package com.study.study_space.jichu.collection.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {

    public static void main(String[] args){

        //有个泛型后，容器也可以通过自动包装机制来添加基本类型
        List<Integer>  list1=new ArrayList<>();
           list1.add(1);
        list1.add(2);
        System.out.println(list1);

        int [] arrB={1,2,3,4,5};
        //Arrays.asList   由数组转为list
        List<Integer>  list2=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list2.add(9);
        System.out.println(list2);
    }


}
