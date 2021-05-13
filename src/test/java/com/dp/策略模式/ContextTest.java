package com.dp.策略模式;

import org.junit.Test;

/**
 * @author by catface
 * @date 2021/5/13 4:29 下午
 */
public class ContextTest {

    @Test
    public void doSomething() {
        Context<Integer> context = new Context<>();
        Strategy<Integer> strategyA = new StrategyA();
        Strategy<Integer> strategyB = new StrategyB();
        Integer data = 1001;
        context.doSomething(data, strategyA);
        System.out.println("*******************************");
        context.doSomething(data, strategyB);
    }
}