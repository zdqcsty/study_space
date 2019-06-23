package jichu.enumDemo;


public class Test2 {

    Test1 test1;
    public Test2(Test1 test1){

        this.test1=test1;
    }


    @Override
    public String toString() {
        return ""+test1;
    }




    public static void main(String[] args) {

        Test1 zeng = Test1.ZENG;
        switch (zeng){

            case ZHOU:
                System.out.println("aaa"); break;

        }


        //        Test1[] enumConstants = Test1.class.getEnumConstants();
//        for(Test1 test1:Test1.values()){
//            System.out.println(test1.toString()+"---"+test1.getDescription());
//        }





    }
}
