package com.study.study_space.web.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class TokenCacheServiceImpl {
    public static final String CACHE_NAME = "accessToken";

    //生成token存入缓存
    @Cacheable(value = CACHE_NAME, key = "#token")
    public String setCache(String token) {
        System.out.println("token放入缓存");
        return "333";
    }

    //判断token是否存在缓存。不存在返回checkfail；存在返回token，并自动刷新闲置时间
    @Cacheable(value = CACHE_NAME)
    public String checkToken(String token) {
        System.out.println("checkfail");
        String s = new Random().nextInt() + "";
        return s;
    }
}