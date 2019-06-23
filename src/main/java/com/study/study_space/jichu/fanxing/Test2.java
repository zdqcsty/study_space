package jichu.fanxing;

import java.util.ArrayList;
import java.util.Collection;

public class Test2 {

    public static void main(String[] args){


        Collection<String> coll=new ArrayList<>();
        Collection<Integer> integers=new ArrayList<>();

        getColection(coll);
        getColection(integers);

    }

    public static  <T> Collection<T> getColection(Collection<T> a){
        return a;
    }

}
