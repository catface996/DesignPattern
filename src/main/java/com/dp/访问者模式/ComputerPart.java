package com.dp.访问者模式;

/**
 * @author by catface
 * @date 2021/5/21 10:42 上午
 */
public abstract class ComputerPart {

    /**
     * 接待访问者
     *
     * @param visitor 访问者
     */
    abstract void accept(Visitor visitor);

    /**
     * 报价
     *
     * @return 电脑部件的价格
     */
    abstract double getPrice();
}
