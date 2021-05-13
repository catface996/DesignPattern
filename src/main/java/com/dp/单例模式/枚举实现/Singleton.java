package com.dp.单例模式.枚举实现;

/**
 * @author by catface
 * @date 2021/5/13 2:55 下午
 */
public enum Singleton {

    /**
     * 单例
     */
    INSTANCE;

    public static Singleton getInstance() {
        return INSTANCE;
    }

}
