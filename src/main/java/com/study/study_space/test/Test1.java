package com.study.study_space.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Test1 {

    public static void main(String[] args) throws ParseException {


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


    public static int[] getShuZu(int[] a,int e,int[] b,int m,int [] c){

        int i,j,k;
        i=j=k=0;
        System.out.println(c.length);
        while(i<e&&j<m){

            if (a[i]>b[j]){
                c[k++]=a[i++];
            }else{
                c[k++]=b[j++];
            }
        }


        while(i<e){
            c[k++]=a[i++];
        }

        while(j<m){
            c[k++]=b[j++];
        }

        return c;
    }

}
