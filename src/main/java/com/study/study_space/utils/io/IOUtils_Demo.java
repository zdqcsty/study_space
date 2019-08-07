package com.study.study_space.utils.io;

import org.apache.commons.io.IOUtils;

import java.io.IOException;

public class IOUtils_Demo {

    public static void main(String[] args) throws IOException {

        //转换IO流为String
        String str = IOUtils.toString(IOUtils_Demo.class.getClassLoader().getResourceAsStream("config/test.txt"), "UTF-8");
        System.out.println(str);

    }

}
