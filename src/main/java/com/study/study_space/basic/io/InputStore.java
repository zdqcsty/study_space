package com.study.study_space.basic.io;

import java.io.*;

public class InputStore {

    public static void main(String[] args){

        binaryFileRead("D:\\aaa\\bbb.txt");

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
