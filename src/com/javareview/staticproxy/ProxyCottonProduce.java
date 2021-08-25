package com.javareview.staticproxy;

/**
 * @Author zkx
 * @ClassName ProxyClothProduce
 * @Description 代理类，代理服装场加工棉花
 * @Date 2021/8/24 16:50
 * Version 1.0
 **/
public class ProxyCottonProduce implements ClothFactory{
    private ClothFactory factory;

    /**
     * 用被代理类对象进行实例化
     * @param factory
     */
    public ProxyCottonProduce(ClothFactory factory){
        this.factory = factory;
    }

    @Override
    public void produceCloth() {
        //对被代理类方法的增强
        System.out.println("代理工厂加工棉花");

        //被代理类（即衣服工厂）实现自己的内容
        factory.produceCloth();
    }
}
