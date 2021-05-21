package com.dp.访问者模式;

/**
 * @author by catface
 * @date 2021/5/21 10:36 上午
 */
public class Computer {

    private ComputerPart cpu = new CPU();
    private ComputerPart board = new Board();
    private ComputerPart memory = new Memory();

    public void acceptVisitor(Visitor visitor) {
        visitor.visitBoard(cpu);
        visitor.visitMemory(memory);
        visitor.visitBoard(board);
    }
}
