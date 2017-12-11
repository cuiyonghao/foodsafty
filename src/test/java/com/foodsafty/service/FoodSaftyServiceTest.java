package com.foodsafty.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"
})
public class FoodSaftyServiceTest {
    @Autowired
    private FoodSaftyService foodSaftyService;
    @Test
    public void getUserList() throws Exception {

    }

    @Test
    public void userLoginState() throws Exception {
    }

    @Test
    public void getUserById() throws Exception {
        System.out.println(foodSaftyService.getUserById("thy"));
    }

    @Test
    public void getManagerList() throws Exception {
    }

    @Test
    public void managerLoginState() throws Exception {
    }

    @Test
    public void userRegister() throws Exception {
    }

}