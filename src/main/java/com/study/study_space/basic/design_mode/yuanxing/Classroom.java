package design_mode.yuanxing;

import java.util.ArrayList;
import java.util.List;

public class Classroom implements Cloneable  {

    int blackBoard;

    List<String> list=new ArrayList<>();

    public Classroom clone(){
        Classroom classroom=null;
        try {
            classroom = (Classroom)super.clone();
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

        Classroom classroom=new Classroom();
        classroom.blackBoard=1;
        classroom.list.add("stat1");
        classroom.show();

        //这里是浅复制
        Classroom clone = classroom.clone();
        clone.show();

        //说明浅复制复制了基本类型
        clone.blackBoard=2;
        clone.show();

        //说明  浅复制只是复制了集合的引用
        clone.list.add("stat2");
        clone.show();
        classroom.show();

    }

}

