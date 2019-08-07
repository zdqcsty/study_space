package com.study.study_space.utils;

import org.apache.commons.lang.StringUtils;

public class StringUtils_Demo {

    public static void main(String[] args) {
        //检测数据为空串 （trim后）
        boolean blank = StringUtils.isBlank(" ");
        System.out.println(blank);
    }

}
