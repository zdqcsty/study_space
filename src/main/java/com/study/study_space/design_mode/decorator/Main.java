package design_mode.decorator;

public class Main {


    public static void main(String[] args) {

        Person teen=new Teenager();
        ShirtDecorator shirt=new ShirtDecorator(teen);
        System.out.println(shirt.getDescription());
        System.out.println(shirt.cost());
    }

}
