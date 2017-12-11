package com.foodsafty.dao;

import com.foodsafty.entity.user;

import java.util.List;

public interface UserDao {

    /**
     * 查询数据库中所有user的信息
     * @return
     */
    int insert(String userId,String userName,String userEmail,String userPhone,String userPassword);

    user queryByUserId(String userId);

    List<user> queryAll();

}
