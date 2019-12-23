package com.study.study_space.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Test2 {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(Test2.class);
        Test3 test3 = (Test3)context.getBean("testBean");
        test3.sayHello();

    }


    public Test2(){
        System.out.println("hello world");
    }


    @Bean
    public Test3 testBean() {
        return new Test3();
    }

}
