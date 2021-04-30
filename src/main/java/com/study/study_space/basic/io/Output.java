package com.study.study_space.basic.io;

import java.io.*;

public class Output {

    public static void main(String[] args) {

        String file = Input.class.getClassLoader().getResource("io.txt").getFile();   //这个路径是classPath下的路径
        printWrite(file);

    }

    /**
     * 使用PrintWriter输出数据
     * @param fileName
     */
    public static void printWrite(String fileName){

        try {
            //写入的时候，原有的内容会被覆盖

            /**
             * 尽量使用PrintWriter  而不是BufferedWriter
             * 因为尽量使用PrintWriter   的println可以自动换行    而不是BufferedWriter  得调用newLine
             * PrintWriter的print、println方法可以接受任意类型的参数   而不是BufferedWriter有局限
             *
             * 有这种装饰者模式会完美解决问题
             */
            //PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
            PrintWriter pw=new PrintWriter(fileName);   //它仍旧在进行缓存,和上面的其实是一样的。PrintWriter提供了一个默认构造器去集成这些
            pw.println("heiheiheiehei");
            pw.close();   //必须显示调用close方法  不然缓冲区就不会被刷新清空   那么它们也就不完整
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
