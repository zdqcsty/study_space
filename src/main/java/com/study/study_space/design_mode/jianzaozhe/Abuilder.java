package design_mode.jianzaozhe;

public class Abuilder extends Builder {

    Computer computer=new Computer();
    @Override
    public void buildScreen() {


        System.out.println("Screen 好了");
    }

    @Override
    public void buildCPU() {
        System.out.println("CPU 好了");
    }

    @Override
    public void buildKeyBoard() {
        System.out.println("KeyBoard 好了");
    }
}