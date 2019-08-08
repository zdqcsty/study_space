package com.study.study_space.bigdata.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

public class Hdfs_Demo {

    public static Configuration conf;

    static {
        conf = new Configuration();
        conf.set("fs.hdfs.impl", org.apache.hadoop.hdfs.DistributedFileSystem.class.getName());
        conf.set("fs.file.impl", org.apache.hadoop.fs.LocalFileSystem.class.getName());
        //使用追加的方式
        conf.setBoolean("dfs.support.append", true);
        //在将数据写到hdfs的时候  必须要读取core-site.xml这个文件
        conf.addResource(Hdfs_Demo.class.getClassLoader().getResourceAsStream("config/core-site.xml"));
    }

    public static void main(String[] args) throws IOException {
        writeToHdfs("/user/guanghao/aaa");
    }


    public static void writeToHdfs(String path) throws IOException {
        FileSystem fs = FileSystem.get(conf);
        Path filePath = new Path(path);
        FSDataOutputStream outputStream = fs.create(filePath);
        outputStream.writeBytes("hahahah");
        outputStream.flush();
        outputStream.close();
        fs.close();
    }

}
