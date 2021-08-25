package com.javareview.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author zkx
 * @ClassName MyInvocationHandler
 * @Description TODO
 * @Date 2021/8/25 9:21
 * Version 1.0
 **/
public class MyInvocationHandler implements InvocationHandler {

    /**
     * 传进来的被代理类的对象
     */
    private Object obj;
    public void bind(Object obj){
        this.obj = obj;
    }


    /**
     * 当我们通过代理类的对象，调用方法时，就会自动地调用如下的方法
     * 将被代理类要执行的方法写在invoke方法中
     * @param proxy 代理类的对象，也就是代理类中getProxyInstance()方法返回的对象
     * @param method 代理类的对象所调的被代理对象的同名方法
     * @param args
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行被代理类对象中的方法，如果被代理类中的方法有返回值的话，returnVal就作为返回值返回
        Object returnVal = method.invoke(obj, args);
        return returnVal;
    }
}
