package com.study.study_space.basic.fanxing;

public class FanxingClassTest2<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        specifyType();
    }

    /**
     * 不指定类型
     */
    public static void noSpecifyType() {
        FanxingClassTest2 glmapperGeneric = new FanxingClassTest2();
        glmapperGeneric.set("test");
        // 需要强制类型转换
        String test = (String) glmapperGeneric.get();
        System.out.println(test);
    }

    /**
     * 指定类型
     */
    public static void specifyType() {
        FanxingClassTest2<String> glmapperGeneric = new FanxingClassTest2();
        glmapperGeneric.set("test");
        // 不需要强制类型转换
        String test = glmapperGeneric.get();
        System.out.println(test);
    }
}
