package com.springlearning.testdemo;

import com.springlearning.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zkx
 * @ClassName springTest
 * @Description TODO
 * @Date 2021/8/24 14:15
 * Version 1.0
 **/

public class SpringTest {
    /**
     * 首先，加载配置文件，按照文件中配置的路径，找到注解下面的类，将其对象创建到IOC容器里面
     * 然后根据注解的名字，以及其对应的类型，get到容器里面对应的对象
     */
    @Test
    public void testService(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

}
