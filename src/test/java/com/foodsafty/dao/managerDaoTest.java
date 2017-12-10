package com.foodsafty.dao;

import com.foodsafty.entity.manager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class managerDaoTest {
    @Resource
    private managerDao managerDao;
    @Test
    public void queryByManagerId() throws Exception {
        String managerId = "admin";
        manager manager = managerDao.queryByManagerId(managerId);
        System.out.println(manager.getManagerPassword());
    }
}