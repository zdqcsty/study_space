package com.study.study_space.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class Test2 {

    public static void main(String[] args) throws ParseException {

        List<String> forEachLists = new ArrayList<>();
        forEachLists.add("a");
        forEachLists.add("b");
        forEachLists.add("c");


        String [] strArray = new String[] {"a", "b", "c"};
        Stream.of(strArray).forEach(s->System.out.println(s));

//        forEachLists.stream().forEach(s-> System.out.println(s));


    }

}
