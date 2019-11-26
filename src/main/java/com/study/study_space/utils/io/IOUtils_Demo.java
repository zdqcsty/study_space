package com.study.study_space.utils.io;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class IOUtils_Demo {


    public static void main(String[] args) throws IOException {
        //转换IO流为String
        String str = IOUtils.toString(IOUtils_Demo.class.getClassLoader().getResourceAsStream("config/test.txt"), "UTF-8");
        System.out.println(str);
    }

}
