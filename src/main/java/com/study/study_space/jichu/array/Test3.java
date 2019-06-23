package jichu.array;

import java.util.Arrays;

/**
 *一维数组创建
 */
public class Test3 {

public static void main(String[] args){

    int [] a;   //数组的声明  注意声明不要指定长度

    //数组初始化
    a=new int[5]; //如果创建对象但不初始化 必须指定数组大小
    a=new int[] {1,2,3}; //初始化则不需要指定大小
    int [] b={1,2,3};//简化方式

    String [] s=new String[5];
    double [] d=new double[5];
    System.out.println(Arrays.toString(s));//系统自动赋予默认值
    System.out.println(Arrays.toString(d));


  }
}
