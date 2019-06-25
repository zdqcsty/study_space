package com.study.study_space.jichu.other;

import java.io.*;

public class SerializableDemo {

    public static void main(String[] args) throws Exception {

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
