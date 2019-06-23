package jichu.collection;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Test2 {




    public static void main(String[] args){

        Set<String> set=new HashSet<>();


        Collections.addAll(set,"1,2,3,4,5".split(","));

        System.out.println(set);

    }

    public Set<Integer>  fillSet(Set<Integer> set,Class<Integer> type){

        for(int i=0;i<10;i++){

            try {
                set.add(type.getConstructor(int.class).newInstance(i));
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        return null;
    }




}

class Test2Demo{

    int i;

    public Test2Demo(int i){
        this.i=i;
    }

}


