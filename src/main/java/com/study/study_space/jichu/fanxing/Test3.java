package com.study.study_space.jichu.fanxing;

//类的泛型  在类名后面加<T>
public class Test3<T> {



    public T t;

    public Test3(T t){

        this.t=t;
    }

    public static void main(String[] args){

        //创建时必须想清楚需要持有什么类型的队象，并将其放到尖括号内   以后就只能往里面存入该类型（子类也可以）
        Test3<String> test3=new Test3<>("3");
        System.out.println(test3.t);
    }
}


