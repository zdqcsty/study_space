package com.study.study_space.jichu.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    public static void main(String[] args) {

        /**
         * Calendar  可以定制化时间，可以获取当前时间的前几天 后几天  或者小时  月 的数据
         */
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
        cal.add(Calendar.HOUR, -1);
        Date date3 = cal.getTime();
        String time3=format.format(date3);
        System.out.println(time3);
    }
}
