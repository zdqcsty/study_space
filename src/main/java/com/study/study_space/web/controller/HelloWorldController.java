package com.study.study_space.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String  gethtml(){
        return  "helloWorld.html";
    }

    //form表单的提交
    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public String  getaaa(String username,String password){
        System.out.println(username);
        System.out.println(password);
       return "aaa";
    }

    //跳转包括视图和数据
    @RequestMapping("/Hi")
    public ModelAndView sayHello() {
          //创建一个模型视图对象
          ModelAndView modelAndView = new ModelAndView();
          modelAndView.setViewName("test");
          modelAndView.addObject("key", 12345);
          //System.out.println("test");
          return modelAndView;
    }

}
