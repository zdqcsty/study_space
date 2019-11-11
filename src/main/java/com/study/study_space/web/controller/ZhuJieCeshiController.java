package com.study.study_space.web.controller;

import com.study.study_space.web.service.impl.CeshiService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Controller
public class ZhuJieCeshiController {

    @Autowired
    public CeshiService ceshiService;

    @Test
    public  void  ceshi(){
        System.out.printf(ceshiService.aaa);
    }


}
