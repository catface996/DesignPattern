package com.dp.单例模式.静态语句块实现;

/**
 * @author by catface
 * @date 2021/5/13 11:19 上午
 */
public class Singleton {

    private static final Singleton INSTANCE;

    static {
        INSTANCE = new Singleton();
    }

    private Singleton() {

    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
