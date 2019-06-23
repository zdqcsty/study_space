package jichu.collection;

import java.util.*;

public class map1 {

    public static void main(String[] args){

        TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>();


        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        System.out.println(map);
        map.get(1);
        System.out.println(map);


        CountMapData demo=new CountMapData();
        
        System.out.println(demo instanceof Demo111);


    }

}

class CountMapData {

    public Map map;

    public CountMapData(){};

    public CountMapData(int num){

        char[] arrChar={'A','B','C','D','E','F','G','H','G','K'};
        Integer key;
        String value;

        map=new HashMap();

        for (int i=0;i<10;i++){
            key=i;
            value=arrChar+""+i;
            map.put(key,value);
        }


    }


}

class Demo111 extends CountMapData{

        }
