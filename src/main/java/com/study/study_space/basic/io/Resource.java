package com.study.study_space.basic.io;

import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.util.Properties;

public class Resource {

    public static void main(String[] args) throws IOException {

        /**
         * 这种情况是有getClassLoader()的情况
         * 默认从classpath中找文件(文件放在resources目录下)，name不能带“/”，否则会抛空指针
         */
        String path1= IOUtils.toString(Resource.class.getClassLoader().getResourceAsStream("config/test.txt"), "utf8");
        System.out.println(path1);

        /**
         * 这种情况是没有getClassLoader()的情况
         * 如果name以"/"开头，那么绝对路径是/后边跟的名字  (也是从classpath下开始算起)
         */
        String utf8 = IOUtils.toString(Resource.class.getResourceAsStream("/config/test.txt"), "utf8");
        System.out.println(utf8);


        /**
         * 读取properties的方式   以及获取key  value
         */
        Properties prop=new Properties();
        prop.load(Resource.class.getClassLoader().getResourceAsStream("config/test.properties"));
        String aaa = prop.getProperty("aaa");
        System.out.println(aaa);
    }
}
