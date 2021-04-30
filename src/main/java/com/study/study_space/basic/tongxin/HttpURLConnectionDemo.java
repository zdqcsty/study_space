package com.study.study_space.basic.tongxin;

import org.apache.commons.io.IOUtils;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionDemo {

    public static void main(String[] args) throws IOException {

        // 如果使用 POST 方法
        URL url = new URL("http://10.130.2.109:8010/ceshi");
        // 如果打算使用 GET 方法
        //URL url = new URL("http://ip.taobao.com/service/getIpInfo.php?ip=xxx.xxx.xxx.xxx");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // 设置连接超时时间
        connection.setConnectTimeout(15000);

        // 设置读取超时时间
        connection.setReadTimeout(15000);

        // 设置请求参数，即具体的 HTTP 方法
        connection.setRequestMethod("GET");

        // 添加 HTTP HEAD 中的一些参数，可参考《Java 核心技术 卷II》
        connection.setRequestProperty("Connection", "Keep-Alive");

        // 设置是否向 httpUrlConnection 输出，
        // 对于post请求，参数要放在 http 正文内，因此需要设为true。
        // 默认情况下是false;
        connection.setDoOutput(true);

        // 设置是否从 httpUrlConnection 读入，默认情况下是true;
        connection.setDoInput(true);

        //getOutputStream 和 getInputStream 内部都会隐式的调用 connect()。

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream(), "UTF-8"));
        writer.write("aaa=ddd");
        writer.flush();
        writer.close();


//        String responseMessage = connection.getResponseMessage();
//        System.out.println(responseMessage);
        int responseCode = connection.getResponseCode();

        //获取URL的返回值
        String s = IOUtils.toString(connection.getInputStream());
        System.out.println(s);
        System.out.println(responseCode+"=========================");


    }


}
