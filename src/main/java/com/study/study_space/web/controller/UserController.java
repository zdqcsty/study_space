package com.study.study_space.web.controller;

import com.study.study_space.web.eneity.User;
import com.study.study_space.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping("/users")
    public List<User> lists() {
        return userService.findUserByLikeName();
    }

    @RequestMapping("/index")
    public ModelAndView  thymeleafTest(Map<String, String> map){
        List<User> users = userService.getUsers();
        //创建一个模型视图对象
        ModelAndView mav = new ModelAndView();
        //设置ViewName   其实就是设置他的转向路径
        mav.setViewName("mav");
        //将数据放置到ModelAndView对象view中,第二个参数可以是任何java类型
        mav.addObject("list", users);
        return mav;
    }

    @ResponseBody
    @GetMapping("/paixu")
    public List<User> test() {
        return userService.paixu();
    }

}
