package design_mode.decorator;

public abstract class Person {

    String description;

    public  String getDescription(){
        return description;
    }

    public abstract Double cost();
}
