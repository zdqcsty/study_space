package com.study.study_space.jichu.date;

import java.util.Date;

public class Date_Demo {


    public static void main(String[] args) {

        getTime_Now();

    }

    /**
     * 获取当前时间的毫秒值
     * @return
     */
    public static  Long  getTime_Now(){

        return  new Date().getTime();
    }








}
