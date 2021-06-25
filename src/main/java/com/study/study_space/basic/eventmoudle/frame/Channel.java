package com.study.study_space.basic.eventmoudle.frame;

public interface Channel<E extends Message> {
    public void dispatch(E message);
}