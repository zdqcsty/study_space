package com.study.study_space.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test2 {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHH");
        Date date = format.parse("2019062712");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR, -13);
        date = cal.getTime();
        String time = format.format(date);

        System.out.println(time);
        Long timeStart = Long.valueOf(time);

    }

}
