package com.dp.访问者模式;

/**
 * @author by catface
 * @date 2021/5/21 10:43 上午
 */
public interface Visitor {

    /**
     * 访问cpu价格
     *
     * @param computerPart cup
     * @return cpu价格
     */
    double visitCpu(ComputerPart computerPart);

    /**
     * 访问内存价格
     *
     * @param computerPart 内存
     * @return 内存价格
     */
    double visitMemory(ComputerPart computerPart);

    /**
     * 访问主板价格
     *
     * @param computerPart 主板
     * @return 主板价格
     */
    double visitBoard(ComputerPart computerPart);

}
