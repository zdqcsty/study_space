package com.study.study_space.jichu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compare_Demo implements Comparable<Compare_Demo> {


    public Integer height;
    public Integer weight;

    public Compare_Demo(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public static void main(String[] args) {

        Compare_Demo cd1 = new Compare_Demo(180, 80);
        Compare_Demo cd2 = new Compare_Demo(178, 80);
        List<Compare_Demo> list = new ArrayList<>();
        list.add(cd1);
        list.add(cd2);
        System.out.println(list.get(0));
        System.out.println(list.toString());
        Collections.sort(list);    // Collections.sort方法将指定的列表按升序排列，列表中的所有元素必须实现Comparable
        System.out.println(list.toString());
        System.out.println(list.get(0));
    }

    @Override
    public int compareTo(Compare_Demo o) {

        int result = height.compareTo(o.height);
        if (result == 0) {
            result = weight.compareTo(o.weight);
        }
        return result;
    }

    public String toString() {
        return "" + height + "@" + weight;
    }
}
