package com.study.study_space.basic.eventmoudle.frame;

public interface Message {
    public Class<? extends Message> getType();
}