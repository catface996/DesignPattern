package com.dp.访问者模式;

import lombok.extern.slf4j.Slf4j;

/**
 * @author by catface
 * @date 2021/5/21 10:57 上午
 */
@Slf4j
public class Student implements Visitor {
    /**
     * 访问cpu价格
     *
     * @param computerPart cup
     * @return cpu价格
     */
    @Override
    public double visitCpu(ComputerPart computerPart) {
        double price = computerPart.getPrice() * 0.5;
        log.info("学生买cpu打5折,价格:{}...", price);
        return price;
    }

    /**
     * 访问内存价格
     *
     * @param computerPart 内存
     * @return 内存价格
     */
    @Override
    public double visitMemory(ComputerPart computerPart) {
        double price = computerPart.getPrice() * 0.4;
        log.info("学生买内存打4折,价格:{}...", price);
        return price;
    }

    /**
     * 访问主板价格
     *
     * @param computerPart 主板
     * @return 主板价格
     */
    @Override
    public double visitBoard(ComputerPart computerPart) {
        double price = computerPart.getPrice() * 0.6;
        log.info("学生购买主板打6折,价格:{}...", price);
        return price;
    }
}
