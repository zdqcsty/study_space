package com.study.study_space.jichu.collection;


import java.util.Iterator;

public class MyArrayList implements Iterable {



    @Override
    public Iterator iterator() {
        return new ArrayIterator();
    }
}


class ArrayIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {

    }

}
