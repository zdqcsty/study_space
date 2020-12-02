package com.study.study_space.jichu.design_mode.bulider;

public class Abuilder extends Builder {

    Computer computer = new Computer();

    @Override
    public void buildMouse(String mouse) {
        computer.setMouse(mouse);
    }

    @Override
    public void buildCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void buildKeyBoard(String keyBoard) {
        computer.setKeyboard(keyBoard);
    }

    @Override
    public void buildMemory(String memory) {
        computer.setMemory(memory);
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}