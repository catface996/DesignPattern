package com.dp.单例模式.双重检查实现;

/**
 * @author by catface
 * @date 2021/5/13 2:16 下午
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
                return instance;
            }
        }
        return instance;
    }

    public static Singleton getInstanceError() {
        if (instance == null) {
            synchronized (Singleton.class) {
                // 此处不做非空判断
                instance = new Singleton();
                return instance;
            }
        }
        return instance;
    }

}
