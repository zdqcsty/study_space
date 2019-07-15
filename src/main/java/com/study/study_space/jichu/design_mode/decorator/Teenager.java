package design_mode.decorator;

public class Teenager extends Person{

    public Teenager(){
        description="shopping list ";
    }

    @Override
    public Double cost() {
        return 0.0;
    }
}
