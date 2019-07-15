package com.study.study_space.jichu.design_mode.jianzaozhe;

public abstract class Builder {

    public abstract void buildMouse(String mouse);
    public abstract void buildCpu(String cpu);
    public abstract void buildKeyBoard(String keyBoard);
    public abstract void buildMemory(String memory);
    public abstract Computer createComputer();

}