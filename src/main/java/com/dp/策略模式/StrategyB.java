package com.dp.策略模式;

/**
 * @author by catface
 * @date 2021/5/13 4:23 下午
 */
public class StrategyB implements Strategy<Integer> {
    /**
     * 策略的操作行为
     *
     * @param integer 策略入参
     */
    @Override
    public void operation(Integer integer) {
        System.out.println("执行B策略的operation方法,打印toString:" + integer.toString());
    }
}
