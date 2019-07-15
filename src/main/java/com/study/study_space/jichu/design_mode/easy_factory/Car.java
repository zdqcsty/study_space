package design_mode.easy_factory;

public class Car implements Transport{

    @Override
    public void run() {
        System.out.println("Car  drive  fast");
    }
}