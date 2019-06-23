package jichu.array;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {

        int [] a={1,2,3};
        //多维数组可以拿{} 隔开
        int [][] b={{1,2},{2,3},{3,4}};
        
        System.out.println(Arrays.toString(a));
        //可以将二维数组开成一维数组   最外层还是引用  比如b[0]
        System.out.println(Arrays.toString(b[0]));
        //b.length   length相当于最外围的长度即你b[a][b]  中的a
        System.out.println(b.length);

        int [][] c=new int [2][3];
        int [] c1={1,2,3};
        c[1]=c1;
        //多维数组展示的话要用 Arrays.deepToString
        System.out.println(Arrays.deepToString(c));
        System.out.println(c.length);

     }
}