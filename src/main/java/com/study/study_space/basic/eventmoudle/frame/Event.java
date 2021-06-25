package com.study.study_space.basic.eventmoudle.frame;

public class Event implements Message {
    @Override
    public Class<? extends Message> getType() {
        return getClass();
    }
}
