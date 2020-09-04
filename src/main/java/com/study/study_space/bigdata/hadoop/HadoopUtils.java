package com.study.study_space.bigdata.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;

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


    //获取hdfs目录下的文件的大小
    public static double getBlockSize(String path) {
        FileSystem fs = getFileSystem();
        double result=-1.0;
        ContentSummary in = null;
        try {
            in = fs.getContentSummary(new Path(path));
            //得出来的结果时兆M
            result=Double.valueOf(in.getLength()) / 1024 / 1024;
        } catch (IOException e) {
            return result;
        }finally {
            try {
                if (fs != null) {
                    fs.close();
                }
            } catch (IOException e) {
            }
        }
        return result;
    }


    //修改文件名称或者移动目录
    public static boolean movePathToPath(String source,String target) {
        FileSystem fs = getFileSystem();
        boolean rename = false;
        try {
            rename = fs.rename(new Path(source), new Path(target));
        } catch (IOException e) {
            return false;
        }
        return rename;
    }

    //复制移动目录 (底层也是流调用)
    public static boolean copyPathToPath(String source,String target) {
        FileSystem fs = getFileSystem();
        boolean copy = false;
        try {
            copy = FileUtil.copy(fs, new Path(source), fs, new Path(target), false, new Configuration());
        } catch (IOException e) {
            return false;
        }
        return copy;
    }

    /**
     * 打印指定目录下文件或者目录的路径
     * @param filePath
     */
    public static void copyPathToPath(String filePath) {
        FileSystem fs = getFileSystem();
        FileStatus[] status = null;
        try {
            status = fs.listStatus(new Path(filePath));
            for (FileStatus file : status) {
                System.out.println(file.getPath());
            }
        } catch (IOException e) {
        }
    }
}
