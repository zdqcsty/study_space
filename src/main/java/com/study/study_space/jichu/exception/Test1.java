package jichu.exception;

import java.io.IOException;

public class Test1 {

    public static void main(String[] args){

        getException();

    }

    public static void getException(){

        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("hahaha");

    }
}
