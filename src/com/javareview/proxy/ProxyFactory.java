package com.javareview.proxy;

import java.lang.reflect.Proxy;

/**
 * @Author zkx
 * @ClassName ProxyFactory
 * @Description 代理类工厂
 * @Date 2021/8/25 9:10
 * Version 1.0
 **/
public class ProxyFactory {
    /**
     * @// TODO: 2021/8/25
     * @param obj 被代理类对象
     * @return 调用此方法，返回一个代理类的对象
     */
    public static Object getProxyInstance(Object obj){
        MyInvocationHandler handler = new MyInvocationHandler();
        //将被代理类对象传入handler中
        handler.bind(obj);
        /*
        会使用handler，自动执行MyInvocationHandler里面的方法
        obj.getClass().getClassLoader():将被代理类中实现的方法传进来
        指明与被代理类一起实现的是哪一个接口
        这样，每一次new的被代理类对象，都能实现代理类里面所有的方法
         */
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);
    }
}
