package com.dp.单例模式.锁实现;

/**
 * @author by catface
 * @date 2021/5/13 2:19 下午
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
