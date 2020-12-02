package com.study.study_space.jichu.design_mode.bulider;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Computer buildComputer(String KeyBoard, String cpu, String memory, String mouse) {
        builder.buildKeyBoard(KeyBoard);
        builder.buildCpu(cpu);
        builder.buildMemory(memory);
        builder.buildMouse(mouse);
        return builder.createComputer();
    }

}