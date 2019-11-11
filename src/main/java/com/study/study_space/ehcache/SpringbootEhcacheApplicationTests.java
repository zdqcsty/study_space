package com.study.study_space.ehcache;

import com.study.study_space.web.service.TokenCacheServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootEhcacheApplicationTests {

    @Resource
    private TokenCacheServiceImpl tokenCacheService;
    @Test
    public void contextLoads() {
        String domovalue1=tokenCacheService.checkToken("hello world");
        System.out.println("第一次查询，值："+domovalue1);
        String domovalue2=tokenCacheService.checkToken("hello");
        System.out.println("第二次查询，值："+domovalue2);

    }

}
