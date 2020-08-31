package com.study.study_space.bigdata.hadoop;

import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class HadoopWrite {

    public static void main(String[] args) throws IOException {
        HadoopUtils hu=new HadoopUtils();
        FileSystem fs = hu.getFileSystem();

        //这种方式写中文是有问题的，是乱码
/*        FSDataOutputStream dos = fs.create(new Path("/user/zgh/demo"));
        dos.writeBytes("中国");
        dos.close();*/

        //如果包含中文，推荐这种方式
        FSDataOutputStream dos = fs.create(new Path("/user/zgh/demo"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(dos,"utf-8"));
        bw.write("中国");
        bw.close();
        fs.close();
    }
}
