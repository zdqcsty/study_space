package com.study.study_space.jichu.io;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class InputStore {

    public static void main(String[] args){

//        binaryFileRead("D:\\aaa\\bbb.txt");

        Calendar ca = Calendar.getInstance();
        ca.add(Calendar.DATE,-1);
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String yestday = format.format(ca.getTime());
        System.out.println(yestday);


    }


    public static void store(String  fileName){

        try {
//            DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
//            dos.writeUTF("hahah");
//            dos.writeDouble(3.1);
//            dos.close();

            DataInputStream dis=new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));
            String s = dis.readUTF();
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void binaryFileRead(String fileName){

        try {
            BufferedInputStream bis=new BufferedInputStream(new FileInputStream(fileName));
            try {
                byte[] b=new byte[bis.available()];
                System.out.println(bis.read(b));
                System.out.println(new String(b));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


}
