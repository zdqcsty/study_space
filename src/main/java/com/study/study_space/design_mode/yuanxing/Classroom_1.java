package design_mode.yuanxing;

import java.util.ArrayList;

public class Classroom_1 implements Cloneable  {

    int blackBoard;

    ArrayList<String> list=new ArrayList<>();

    public Classroom_1 clone(){
        Classroom_1 classroom=null;
        try {
            classroom = (Classroom_1)super.clone();
            //集合得实现Cloneable才可以    这里有个坑  ArrayList  实现了Cloneable   但是List没有
            list = (ArrayList<String>) this.list.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return classroom;
    }

    public void show(){

        System.out.println(blackBoard);
        System.out.println(list);

    }

    public static void main(String[] args){

        Classroom_1 classroom=new Classroom_1();
        classroom.blackBoard=1;
        classroom.list.add("stat1");
        classroom.show();

        //深复制将集合等也进行了复制
        Classroom_1 clone = classroom.clone();
        clone.list.add("stat2");
        clone.show();
        classroom.show();


    }

}
