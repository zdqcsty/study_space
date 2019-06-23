package test;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class Test3 {

    public static void main(String[] args) throws IOException {

        String s = IOUtils.toString(Test3.class.getResourceAsStream("demo.sql"), "UTF-8");
        System.out.println(s);

    }


}
