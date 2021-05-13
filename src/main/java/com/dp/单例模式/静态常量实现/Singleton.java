package com.dp.单例模式.静态常量实现;

/**
 * @author by catface
 * @date 2021/5/13 10:15 上午
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

}
