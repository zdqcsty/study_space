package com.study.study_space.basic.collection;

import java.util.*;

public class Test2 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        Collections.addAll(set, "1,2,3,4,5".split(","));
        System.out.println(set);
    }

    public Set<Integer> fillSet(Set<Integer> set, Class<Integer> type) {

        for (int i = 0; i < 10; i++) {

            try {
                set.add(type.getConstructor(int.class).newInstance(i));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}