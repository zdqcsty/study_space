package com.study.study_space.jichu.design_mode.celue;


public class Context {

    public Strategy strategy;

    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    public void exeute(int a,int b){

        strategy.doSomething(a,b);

    }

    /**
     *  策略模式是对算法的封装，把一系列的算法分别封装到对应的类中，并且这些类实现相同的接口，相互之间可以替换。
     *调用算法的主体则是封装到了封装类Context中，抽象策略Strategy一般是一个接口，目的只是为了定义规范，里面一般不包含逻辑。其实，这只是通用实现，而在实际编程中，
     * 因为各个具体策略实现类之间难免存在一些相同的逻辑，为了避免重复的代码，我们常常使用抽象类来担任Strategy的角色
     */

    public static void main(String[] args){

        AddStrategy addStrategy=new AddStrategy();
        Context context=new Context(addStrategy);
        context.exeute(2,3);

        SubtractStrategy subtractStrategy=new SubtractStrategy();
        context=new Context(subtractStrategy);
        context.exeute(2,3);
    }

}