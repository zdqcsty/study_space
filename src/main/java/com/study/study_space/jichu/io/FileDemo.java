package jichu.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class FileDemo {

    public static File file;

    public static void main(String[] args){

        File file=new File("D:\\aaa");

        String name = file.getName();

        String absolutePath = file.getAbsolutePath();

        boolean b = file.canRead();

        boolean b1 = file.canWrite();

        boolean c = file.isFile();

        boolean c1 = file.isDirectory();

        listFile("D:\\aaa");

    }

    public static void listFile(String fileName){

        file=new File(fileName);

        if (file.isFile()){
            System.out.println( fileName);
        }
        if (file.isDirectory()){
            String[] list = file.list();
            File[] files = file.listFiles();
            String[] list1 = file.list(new FilenameFilter() {
                Pattern pattern = Pattern.compile("a.*");
                @Override
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
            });
            System.out.println(Arrays.toString(list1));
        }
    }



}
