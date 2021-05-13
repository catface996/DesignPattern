package com.dp.单例模式.内部类实现;

/**
 * @author by catface
 * @date 2021/5/13 11:39 上午
 */
public class Singleton {

    private Singleton() {

    }

    public static Singleton getInstance() {
        return InnerSingleton.INSTANCE;
    }

    static class InnerSingleton {
        private static final Singleton INSTANCE = new Singleton();

        private InnerSingleton() {

        }
    }
}
