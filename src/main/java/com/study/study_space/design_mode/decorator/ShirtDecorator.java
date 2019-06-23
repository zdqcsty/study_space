package design_mode.decorator;

public class ShirtDecorator extends Decorator{

    public ShirtDecorator(Person person) {
        super(person);
    }

    public  String getDescription(){
        return person.description+":"+"shirt";
    }

    @Override
    public Double cost() {
        return  person.cost()+75;
    }
}
