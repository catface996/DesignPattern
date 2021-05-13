package com.dp.策略模式;

/**
 * @author by catface
 * @date 2021/5/13 4:23 下午
 */
public interface Strategy<T> {

    /**
     * 策略的操作行为
     *
     * @param t 策略入参
     */
    void operation(T t);
}
