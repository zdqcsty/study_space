package com.study.study_space.jichu.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, -1);
        Date time = cal.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String date1=format.format(time);
        System.out.println(date1);
        cal.add(Calendar.DATE, -1);
        Date date2 = cal.getTime();
        String time2=format.format(date2);
        System.out.println(time2);

    }
}
