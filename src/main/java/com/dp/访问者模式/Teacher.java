package com.dp.访问者模式;

import lombok.extern.slf4j.Slf4j;

/**
 * @author by catface
 * @date 2021/5/21 11:05 上午
 */
@Slf4j
public class Teacher implements Visitor {
    /**
     * 访问cpu价格
     *
     * @param computerPart cup
     * @return cpu价格
     */
    @Override
    public double visitCpu(ComputerPart computerPart) {
        log.info("老师购买CPU不打折,价格:{}...", computerPart.getPrice());
        return computerPart.getPrice();
    }

    /**
     * 访问内存价格
     *
     * @param computerPart 内存
     * @return 内存价格
     */
    @Override
    public double visitMemory(ComputerPart computerPart) {
        log.info("老师购买内存不打折,价格:{}...", computerPart.getPrice());
        return computerPart.getPrice();
    }

    /**
     * 访问主板价格
     *
     * @param computerPart 主板
     * @return 主板价格
     */
    @Override
    public double visitBoard(ComputerPart computerPart) {
        log.info("老师购买主板不打折,价格:{}...",computerPart.getPrice());
        return computerPart.getPrice();
    }
}
