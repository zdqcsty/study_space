package com.study.study_space.basic.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    public static void main(String[] args) {


    }

    public static void CalendarTest() {
        /**
         * Calendar  可以定制化时间，可以获取当前时间的前几天 后几天  或者小时  月 的数据
         */
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, -1);
        Date time = cal.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String date1 = format.format(time);
        System.out.println(date1);
        cal.add(Calendar.DATE, -1);
        Date date2 = cal.getTime();
        String time2 = format.format(date2);
        System.out.println(time2);
        cal.add(Calendar.HOUR, -1);
        Date date3 = cal.getTime();
        String time3 = format.format(date3);
        System.out.println(time3);
    }


    public static Long getTime_Now() {
        return new Date().getTime();
    }

    public static void SimpleDateFormatTest() throws ParseException {
        String str = "2009-02-15 09:21:35.345";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒SSS毫秒");
        Date date = sdf1.parse(str);//提取格式中的日期
        System.out.println("转换之前的日期："+date);
        String newStr = sdf2.format(date); //改变格式
        System.out.println("转换之后的日期："+newStr);
    }


}
