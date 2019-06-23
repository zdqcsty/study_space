package paixu;

import java.util.Arrays;

public class jishu {

    public static void main(String[] args) {

        int [] a = {-1, 2, 0, 4, 3, 6, 5, 8, -2, 1, 3, 0, 3, 6, 5, 2};

        int[] jishu = jishu(a);
        System.out.println(Arrays.toString(jishu));
    }


    public static int[] jishu(int[] arr){
        int min=0;  int max=0;int bi=0;
        int[] c;
        int[] b=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
            if (arr[i]>max){
                max=arr[i];
            }
        }
        c=new int[max-min+1];
        for (int i=0;i<arr.length;i++){
            c[arr[i]-min]++;
        }

        for(int i=0;i<c.length;i++){
            while (c[i]>0){
                b[bi]=i+min;
                c[i]--;
                bi++;
            }
        }
        return b;
    }
}
