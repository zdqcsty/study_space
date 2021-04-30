package com.study.study_space.basic.design_mode.bulider;

public abstract class Builder {

    public abstract void buildMouse(String mouse);
    public abstract void buildCpu(String cpu);
    public abstract void buildKeyBoard(String keyBoard);
    public abstract void buildMemory(String memory);
    public abstract Computer createComputer();

}