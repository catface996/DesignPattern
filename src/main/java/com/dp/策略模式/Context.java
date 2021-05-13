package com.dp.策略模式;

/**
 * @author by catface
 * @date 2021/5/13 4:23 下午
 */
public class Context<T> {

    public void doSomething(T data, Strategy<T> strategy) {
        System.out.println("do something....before...");
        strategy.operation(data);
        System.out.println("do something...after...");
    }
}
