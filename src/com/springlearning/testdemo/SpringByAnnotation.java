package com.springlearning.testdemo;

import com.springlearning.config.SpringConfig;
import com.springlearning.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zkx
 * @ClassName SpringByAnnotation
 * @Description TODO
 * @Date 2021/8/24 15:37
 * Version 1.0
 **/
public class SpringByAnnotation {
    @Test
    public void testService(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
