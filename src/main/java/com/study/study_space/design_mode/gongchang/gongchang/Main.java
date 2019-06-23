package design_mode.gongchang.gongchang;

public class Main {
    public static void main(String[] args){

        Factory carFactory=new CarFactory();
        carFactory.make();

        Factory bicycleFactory=new BicycleFactory();
        bicycleFactory.make();
    }

}
