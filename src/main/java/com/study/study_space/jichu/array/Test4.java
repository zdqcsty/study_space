package jichu.array;

import java.util.Arrays;
import java.util.Collections;

public class Test4 implements Comparable<Test4>{

    int i;
    int j;
    public Test4(int i,int j){
        this.i=i;
        this.j=j;
    }


    @Override
    public String toString() {
        return "Test4{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
    public int compareTo(Test4 test4) {

        return i<test4.i ? -1 : (i==test4.i ? 0 :1);
    }


    public static void main(String[] args){

      Test4 [] t4={new Test4(1,5),new Test4(6,1),new Test4(2,3),new Test4(9,8)};

//      Arrays.sort(t4);
        Arrays.sort(t4, Collections.reverseOrder());
      System.out.println(Arrays.toString(t4));
    }

}


class Demo{

    int i;
    int j;
    public Demo(int i,int j){
        this.i=i;
        this.j=j;
    }


    @Override
    public String toString() {
        return "Demo{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}
