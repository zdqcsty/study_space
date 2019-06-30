package jichu.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormateDemo {

    public static void main(String[] args) throws ParseException {

         String str = "2009-02-15 09:21:35.345";
         SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
         SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒SSS毫秒");
         Date date = sdf1.parse(str);//提取格式中的日期
         System.out.println("转换之前的日期："+date);
         String newStr = sdf2.format(date); //改变格式
         System.out.println("转换之后的日期："+newStr);

    }

}
