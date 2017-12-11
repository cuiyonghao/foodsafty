package com.foodsafty.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class userDaoTest {
    @Resource
    UserDao userDao;

    @Test
    public void queryByUserId() throws Exception {
        System.out.println(userDao.queryByUserId("thy"));
    }

}