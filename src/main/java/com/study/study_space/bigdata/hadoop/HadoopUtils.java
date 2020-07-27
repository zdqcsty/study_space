package com.study.study_space.bigdata.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class HadoopUtils {


    public static FileSystem getFileSystem() {

        //以我们公司自己的合并环境当作示例
        System.setProperty("HADOOP_USER_NAME", "hadoop");   //以Hadoop用户，不然报权限错误
        FileSystem fileSystem = null;
        Configuration conf = new Configuration();
        conf.addResource("hebing/core-site.xml");
        conf.addResource("hebing/hdfs-site.xml");
        //这个对与内外网环境很有用 （如果内外网不配置这个将访问将会报错，访问ip报错，设置这个参数是直接访问主机名）
        conf.set("dfs.client.use.datanode.hostname", "true");

        try {
            fileSystem = FileSystem.get(conf);
        } catch (IOException e) {
        }
        return fileSystem;
    }

    public static Integer getLinuNum(String path, FileSystem fs) throws IOException {

        if (!fs.exists(new Path(path))) {
            throw new RuntimeException("目录不存在");
        }
        int linenumber = 0;
        fs = getFileSystem();

        if (fs.isFile(new Path(path))) {
            FSDataInputStream aaa = fs.open(new Path(path));
            LineNumberReader lnr = new LineNumberReader(new InputStreamReader(aaa));
            while (lnr.readLine() != null) {
                linenumber++;
            }
            return linenumber;
        }

        if (fs.exists(new Path(path)) && fs.isDirectory(new Path(path))) {
            for (FileStatus status : fs.listStatus(new Path(path))) {
                FSDataInputStream aaa = fs.open(status.getPath());
                LineNumberReader lnr = new LineNumberReader(new InputStreamReader(aaa));
                while (lnr.readLine() != null) {
                    linenumber++;
                }
            }
            return linenumber;
        }
        return null;
    }


}
