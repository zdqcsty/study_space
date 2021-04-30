package com.study.study_space.basic.other;

import java.io.*;

public class SerializableDemo {

    public static void main(String[] args) throws Exception {

        /**序列化的好处
         * 用于将 Java 对象转换为字节数组，便于存储或传输。
         */

        People zeng=new People();
        zeng.setHeight(178);
        zeng.setName("zeng");

        ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("aaa"));
        os.writeObject(zeng);

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("aaa"));
        People o = (People)ois.readObject();
        System.out.println(o);

    }
}


class  People  implements  Serializable{

    //序列化ID  一般1L 就可以
    private static final long SerializableId=1L;

    String name;
    Integer height;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }
}
