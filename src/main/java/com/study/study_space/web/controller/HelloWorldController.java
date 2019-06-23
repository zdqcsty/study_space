package com.study.study_space.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String  gethtml(){
        return  "helloWorld";
    }

    //什么时候会返回html   什么时候会返回jsp

    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public String  getaaa(String username,String password){
        System.out.println(username);
        System.out.println(password);
       return "aaa";
    }

}
