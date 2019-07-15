package design_mode.jianzaozhe;

public class Main {

    public static void main(String[] args){

        Director director=new Director();

        Builder builder=new Abuilder();

        director.build(builder);
        Computer computer = builder.getComputer();

        System.out.println(computer);
    }

}