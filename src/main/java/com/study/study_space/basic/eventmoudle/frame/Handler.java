package com.study.study_space.basic.eventmoudle.frame;

public class Handler implements Channel<Event> {
    @Override
    public void dispatch(Event message) {
        System.out.println(message.getClass());
    }
}
