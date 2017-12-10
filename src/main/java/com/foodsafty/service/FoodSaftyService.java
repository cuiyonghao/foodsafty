package com.foodsafty.service;

import com.foodsafty.dto.managerLogin;
import com.foodsafty.dto.userLogin;
import com.foodsafty.dto.userRegister;
import com.foodsafty.entity.manager;
import com.foodsafty.entity.user;
import com.foodsafty.service.impl.foodSaftyServiceimpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface FoodSaftyService{

    List<user> getUserList();

    userLogin userLoginState(String userId, String userPassword);

    user getUserById(String userId);

    List<manager> getManagerList();

//    manager getManagerPasswordById(String managerId);

    managerLogin managerLoginState(String managerId, String managerPassword);

    userRegister userRegister(String userId, String userName, String userEmail, String userPhone, String userPassword);
}
