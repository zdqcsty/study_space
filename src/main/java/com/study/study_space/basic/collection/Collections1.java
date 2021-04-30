package jichu.collection;

import java.util.ArrayList;
import java.util.List;

public class Collections1 {

    public static void main(String[] args){

        List<String> list= new ArrayList<>();
        java.util.Collections.addAll(list,"one","two","three","four","five");



//        Collections.replaceAll(list,"one","new");
//        String max = Collections.max(list);
//        System.out.println(max);

//        Collections.rotate(list,2);
//        Collections.shuffle(list,new Random(50));

        java.util.Collections.sort(list); //之所以能用sort方法  是因为list中的string 实现了 Comparable

        List<String> list1 = java.util.Collections.unmodifiableList(list);//让list变成只读模式


//        list1.add("hah");

        System.out.println(list1);

    }
}
