package design_mode.jianzaozhe;

public abstract class Builder {

    public abstract void buildScreen();
    public abstract void buildCPU();
    public abstract void buildKeyBoard();
    public Computer getComputer(){

        return new Computer();
    }
}