package com.study.study_space.web.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CeshiService {

    @Value("hello world")
    public String bbb;

    @Value("${ceshi}")
    public String aaa;

}
