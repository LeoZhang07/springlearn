package com.javareview.proxy;

/**
 * @Author zkx
 * @ClassName SuperMan
 * @Description 被代理类
 * @Date 2021/8/24 21:25
 * Version 1.0
 **/
public class SuperMan implements Human{
    /**
     * 动态代理测试
     * @return 人的信仰
     */
    @Override
    public String getBelief() {
        return "I believe I can fly";
    }

    /**
     * 动态代理测试
     */
    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃"+food);
    }
}
