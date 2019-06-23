package design_mode.celue;

public class Context {

    public Strategy strategy;

    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    public void exeute(int a,int b){

        strategy.doSomething(a,b);

    }

    public static void main(String[] args){

        AddStrategy addStrategy=new AddStrategy();
        Context context=new Context(addStrategy);
        context.exeute(2,3);

        SubtractStrategy subtractStrategy=new SubtractStrategy();
        context=new Context(subtractStrategy);
        context.exeute(2,3);
    }

}