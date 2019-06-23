package jichu.fanxing;

public class Test1 {


    public static  <T> void getT(T t){
        System.out.println(t.getClass().getName());
    }


    public static void main(String[] args){

        getT(1);
        getT("2");


    }




}



