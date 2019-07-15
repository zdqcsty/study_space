package design_mode.gongchang.gongchang;

public class CarFactory implements Factory{
    @Override
    public void make() {

        System.out.println("make a car");
    }
}