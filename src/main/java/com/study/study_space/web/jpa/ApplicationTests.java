package com.study.study_space.web.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private DemoRepository demoRepository;

    //junit 单元测试事务会自动回滚。通过@Rollback(true)注解来实现，默认是true，事务会回滚，可以不写。false时事务不会回滚，数据会写到数据库中。
    @Test
    @Rollback(false)
    @Transactional
    public void test() throws Exception {

        User user=new User();
        user.setAge("239");
        user.setName("aaaaaa");

        demoRepository.save(user);
    }
}