package com.study.study_space.bigdata.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Utils {

    public static void main(String[] args) {

        String s = file_Count("hdfs:///user/guanghao/", "/user/guanghao/shiot");
        System.out.println("========================");
        System.out.println(s);
        System.out.println("========================");

    }

    public static String file_Count(String url,String...hdfsPath){
        Configuration conf = new Configuration();
        conf.setClassLoader(Utils.class.getClassLoader());
        conf.set("fs.hdfs.impl", "org.apache.hadoop.hdfs.DistributedFileSystem");
        //统计hdfs文件大小
        FileSystem hdfs = null;
        try {
            hdfs = FileSystem.get(new URI(url), conf);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        long length= 0L;
        for (String aHdfsPath : hdfsPath) {
            Path path = new Path(aHdfsPath);
            FileStatus[] listStatus = new FileStatus[0];
            try {
                assert hdfs != null;
                listStatus = hdfs.listStatus(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                length += hdfs.getContentSummary(path).getLength();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return length/1024/1024/1024+"";
    }
}


