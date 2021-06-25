package com.study.study_space.basic.eventmoudle.frame;

public interface DynamicRouter<E extends Message> {
    public void registerChannel(Class<? extends E> contentType,
                                Channel<? extends E> channel);
    public abstract void dispatch(E content);
}
