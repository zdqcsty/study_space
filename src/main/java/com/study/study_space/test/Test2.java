package test;

import org.apache.commons.io.FileUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {

    public static void main(String[] args) throws ParseException {

        long yyyyMMddHHmm = new SimpleDateFormat("yyyyMMddHHmm").parse("201905311510").getTime();
        long yyyyMMddHHmm1 = new SimpleDateFormat("yyyyMMddHHmm").parse("201905311523").getTime();
        System.out.println(Math.abs((yyyyMMddHHmm1-yyyyMMddHHmm)/60000));
    }

}
