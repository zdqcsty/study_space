package com.study.study_space.jichu.log;

import org.apache.log4j.Logger;

public class Test2 {

    public static final Logger LOGGER=Logger.getLogger("Test1.class");
    //循环次数
    private static long CYCLE = 102;
    //程序入口——主函数
    public static void main(String[]args){

//        long startTime = System.currentTimeMillis();
//        for(int i=0;i<CYCLE;i++){
//            if(i<100){
//                try{
//                    LOGGER.info(new Person("godtrue",100/i,'M'));//打印对象的信息
//                }catch(Exception e){
//                    LOGGER.error(i+"岁的小孩还不存在嘛！");//打印对象的信息
//                }
//            }else{
//                LOGGER.warn("我是一棵树，我今年活了"+i+"岁!哈哈，我厉害吧！");//打印对象的信息
//            }
//        }
//        System.out.println("此程序的运行时间是："+(System.currentTimeMillis()-startTime));//打印程序运行的时间



    }
}
