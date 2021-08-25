package com.springlearning.dao.impl;

import com.springlearning.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Author zkx
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Date 2021/8/24 10:46
 * Version 1.0
 **/

@Repository(value = "xxx")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao add()..........");
    }
}
