package com.springlearning.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zkx
 * @ClassName SpringConfig
 * @Description 作为配置类，代替xml文件
 *              @ComponentScan开启组件扫描
 *              一般是基于springboot进行完全注解开发
 * @Date 2021/8/24 15:30
 * Version 1.0
 **/

@Configuration
@ComponentScan(basePackages = {"com.springlearning"})
public class SpringConfig {

}
