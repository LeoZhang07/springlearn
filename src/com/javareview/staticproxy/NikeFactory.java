package com.javareview.staticproxy;

/**
 * @Author zkx
 * @ClassName NikeFactory
 * @Description TODO
 * @Date 2021/8/24 17:26
 * Version 1.0
 **/
public class NikeFactory implements ClothFactory{
    @Override
    public void produceCloth() {
        System.out.println("Nike制作衣服");
    }
}
