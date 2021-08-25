package com.springlearning.service;

import com.springlearning.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author zkx
 * @ClassName UserService
 * @Description TODO
 * @Date 2021/8/24 14:05
 * Version 1.0
 **/

@Service
public class UserService {

    /**
     * 定义userDao类型的属性,而UserDaoImpl上面的@Repository注解就会将类本身注入下面的对象中
     * 相当于 new UserDaoImpl，注入一个UserDao类型的对象userDao
     */
    @Autowired
    @Qualifier(value = "xxx")
    private UserDao userDao;

    public void add(){
        System.out.println("service add");
        userDao.add();
    }
}
