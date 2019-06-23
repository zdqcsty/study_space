package design_mode.decorator;

public abstract class Decorator extends Person{

    public Person person;

    public Decorator(Person person){
        this.person=person;
    }

    public abstract Double cost();
}

