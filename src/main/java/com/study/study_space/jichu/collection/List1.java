package jichu.collection;

import java.util.*;
import java.util.Collections;

public class List1 {

    public static void main(String[] args){

        List<String> list= new ArrayList<>();
        Collections.addAll(list,"one","two","three","four","five");



//        ListIterator<String> stringListIterator = list.listIterator();
//
//        while(stringListIterator.hasNext()){
//            stringListIterator.next();
//            stringListIterator.remove();
//        }

        for(String str:list){

            list.remove(str);
        }
        System.out.println(list);

        
/*        Iterator<String> iterator = list.iterator();
//        list.add("eight");   // 这样会报错  获取迭代器之后就不能修改容器   java可以放置多个进城修改容器
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();  //可以调用自己的remove方法
            break;
        }*/
        
//        System.out.println(list);
        





    }

}
