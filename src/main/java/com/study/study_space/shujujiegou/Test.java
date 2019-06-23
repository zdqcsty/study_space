package shujujiegou;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int a=5;

        int[] b={12,3,4,5,6};
        b[1]=10;
        System.out.println(Arrays.toString(b));

        if (a>1){
            System.out.println("1");
        }else if(a==1){
            System.out.println("2");
        }else{
            System.out.println("3");
        }

        System.out.println(0>>>16);

    }
}
