package com.foodsafty.service.impl;

import com.foodsafty.dao.managerDao;
import com.foodsafty.dao.UserDao;
import com.foodsafty.dto.managerLogin;
import com.foodsafty.dto.userLogin;
import com.foodsafty.dto.userRegister;
import com.foodsafty.entity.manager;
import com.foodsafty.entity.user;
import com.foodsafty.service.FoodSaftyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("FoodSaftyService")
@Transactional
public class foodSaftyServiceimpl implements FoodSaftyService{
    @Autowired
    private managerDao managerDao;
    @Autowired
    private UserDao userDao;

    private user user;

    private manager manager;
    public void foodSaftyServiceimpl(){
    }
    @Override
    public List<user> getUserList() {
        List<user> list = new ArrayList<com.foodsafty.entity.user>();
        try{
            list = userDao.queryAll();
        }catch (Exception e){
            list.add(null);
        }
        return list;
    }

    @Override
    public userLogin userLoginState(String userId, String userPassword) {
        user =  userDao.queryByUserId(userId);

        if(userPassword == user.getUserPassword())
        {
            return new userLogin(true,userId);
        }
        else
        {
            return new userLogin(false);
        }
    }

    @Override
    public user getUserById(String userId) {
        return userDao.queryByUserId(userId);
    }

    @Override
    public List<manager> getManagerList() {
        return null;
    }

    @Override
    public managerLogin managerLoginState(String managerId, String managerPassword) {
        manager = managerDao.queryByManagerId(managerId);

        if(managerPassword == manager.getManagerPassword())
        {
            return new managerLogin(true,managerId);
        }else{
            return new managerLogin(false);
        }
    }

    @Override
    public userRegister userRegister(String userId, String userName, String userEmail, String userPhone, String userPassword) {
        userDao.insert(userId,userName,userEmail,userPhone,userPassword);
        //功能异常未写
        return new userRegister(true,userId,userName,userEmail,userPhone,userPassword) ;
    }
}
