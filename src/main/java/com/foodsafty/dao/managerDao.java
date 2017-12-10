package com.foodsafty.dao;

import com.foodsafty.entity.manager;

public interface managerDao {

    manager queryByManagerId(String managerId);

}
