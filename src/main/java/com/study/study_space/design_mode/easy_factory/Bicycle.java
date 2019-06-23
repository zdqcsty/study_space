package design_mode.easy_factory;

public class Bicycle implements Transport{

    @Override
    public void run() {
        System.out.println("bicycle driver slow");
    }
}