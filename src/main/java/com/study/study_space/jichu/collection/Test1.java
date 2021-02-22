package com.study.study_space.jichu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {

        List<Demo> list = new ArrayList<>(Collections.nCopies(4, new Demo("5")));

//        ListIterator<String> stringListIterator = list.listIterator();
//
//        while(stringListIterator.hasNext()){
//            stringListIterator.next();
//            stringListIterator.remove();
//        }

        List<String> a1 = new ArrayList<>();
        a1.add("11");
        a1.add("22");
        List<String> b1 = new ArrayList<>();

    }

}

class Demo {

    String s;

    public Demo(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        //super.toString   相当于调用父类的toString方法
        return super.toString() + ":" + s;
    }
}
