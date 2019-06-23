package design_mode.jianzaozhe;

public class Director {

    public  void  build(Builder builder){
        builder.buildScreen();
        builder.buildCPU();
        builder.buildKeyBoard();
    }
}