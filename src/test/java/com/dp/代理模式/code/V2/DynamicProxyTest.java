package com.dp.代理模式.code.V2;

/**
 * @author by catface
 * @date 2021/5/20 10:36 上午
 */
public class DynamicProxyTest {

    //TODO 注意,此处需要使用main方法作为入口方可,不能使用@Test注解
    public static void main(String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        DynamicProxy dynamicProxy = new DynamicProxy(new Tank());
        dynamicProxy.run();
    }
}