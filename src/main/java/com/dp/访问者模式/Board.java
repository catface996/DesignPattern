package com.dp.访问者模式;

/**
 * @author by catface
 * @date 2021/5/21 10:55 上午
 */
public class Board extends ComputerPart {
    /**
     * 接待访问者
     *
     * @param visitor 访问者
     */
    @Override
    void accept(Visitor visitor) {
        visitor.visitBoard(this);
    }

    /**
     * 报价
     *
     * @return 电脑部件的价格
     */
    @Override
    double getPrice() {
        return 100;
    }
}
