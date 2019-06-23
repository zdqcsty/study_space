package jichu.io;

import java.io.*;
import java.util.Properties;

public class Input {

    public static void main(String[] args) throws IOException {

        /**
         * 获取 resource下文件  路径的方法   Input.class.getClassLoader().getResource("io.txt").getFile();
         */
        String file = Input.class.getClassLoader().getResource("io.txt").getFile();
        String path = Input.class.getClassLoader().getResource("io.txt").getPath();
//        System.out.println(file);
//        System.out.println(path);
//        System.out.println(readFile(file));


        InputStream resourceAsStream = Input.class.getResourceAsStream("/io.txt");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        String iot = (String)properties.get("iot");
        System.out.println(iot);

    }


    //常见读取字符文件的形式
    public static String readFile(String fileName){

        try {
            BufferedReader br=new BufferedReader(new FileReader(fileName));//用bufferedReader 作为缓冲
            StringBuffer sb=new StringBuffer();
            String s;
            while( (s=br.readLine())!=null){
                sb.append(s+"\n");
            }
            br.close();  //注意关闭流
            return sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }



    //字节形式读取
    public static void byteRead(String fileName) throws IOException {

       DataInputStream dis=new DataInputStream(new ByteArrayInputStream(readFile(fileName).getBytes()));

        while (dis.available()!=0){
            try {
                System.out.print((char)dis.readByte());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
