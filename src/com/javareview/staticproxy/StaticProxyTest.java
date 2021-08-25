package com.javareview.staticproxy;

import org.junit.Test;

/**
 * @Author zkx
 * @ClassName StaticProxyTest
 * @Description 静态代理
 * @Date 2021/8/24 16:48
 * Version 1.0
 **/
public class StaticProxyTest {
    @Test
    public void test(){
        ClothFactory factory = new ProxyCottonProduce(new NikeFactory());
        factory.produceCloth();
    }
}
