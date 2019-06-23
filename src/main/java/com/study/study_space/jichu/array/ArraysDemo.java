package jichu.array;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args){

        String [] arrStr={"one","Two","three","Four","five"};
//        Arrays.sort(arrStr);
        Arrays.sort(arrStr,String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(arrStr));

        int [] arrA =new int[7];
        int [] arrB =new int [4];
        Arrays.fill(arrA,7);
        Arrays.fill(arrB,6);
        // 复制数组到指定数组
        System.arraycopy(arrB,1,arrA,0,3);
        System.out.println(Arrays.toString(arrA));
    }

}
