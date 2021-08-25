package com.javareview.proxy;

/**
 * @Author zkx
 * @ClassName ProxyTest
 * @Description TODO
 * @Date 2021/8/25 9:07
 * Version 1.0
 **/
public class ProxyTest {
    public static void main(String[] args) {
        //获取代理类对象
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(new SuperMan());
        //每个方法在执行的时候，
        proxyInstance.getBelief();
        proxyInstance.eat("柚子");
    }
}
