package design_mode.jianzaozhe;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    List<String> list=new ArrayList<>();

    public void add(String str){
        list.add(str);
    }


    public String toString(){

        return list.toString();

    }


}