package com.study.study_space.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test1 {

    public static void main(String[] args)  {


//        StringBuilder sb=new StringBuilder();
//        sb.append("aaa");
//        char[] char_arr = "".toCharArray();
//        for(char ch:char_arr){
//            if(ch != '\r' && ch != '\n' && ch !='\''){
//                sb.append(ch);
//            }
//        }
//
//        System.out.println(sb.toString());

//



        HashMap map=new HashMap();




//        String aaa="133.95.8.27,GPFDIST_PORT=8000,GPFDIST_MAX_SPEND=5";
//        System.out.println(aaa);



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
