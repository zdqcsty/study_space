package com.study.study_space.basic.fanxing;

/**
 * 泛型类
 * @param <T>
 */
public class FanxingClassTest<T> {

    private Object[] arrObject = new Object[2];

    private int size = 0;

    public FanxingClassTest() {

    }

    //在类上定义泛型,在类的方法上也可以使用
    public T getObject(int i) {
        return (T) arrObject[i];
    }

    public void addElement(T t) {
        arrObject[size++] = t;
    }

    public static void main(String[] args) {

        FanxingClassTest<String> test = new FanxingClassTest<>();
        test.addElement("aaa");
        test.addElement("bbb");

        String object = test.getObject(1);
        String object1 = test.getObject(0);
        System.out.println(object);
        System.out.println(object1);
    }

}



