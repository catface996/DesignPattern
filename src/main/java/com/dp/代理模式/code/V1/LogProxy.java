package com.dp.代理模式.code.V1;

/**
 * @author by catface
 * @date 2021/5/20 10:14 上午
 */
public class LogProxy implements Movable {

    private Movable movable;

    public LogProxy(Movable movable) {
        this.movable = movable;
    }

    /**
     * 移动
     */
    @Override
    public void move() {
        writeLog();
        movable.move();
    }

    public void writeLog() {
        System.out.println("writing log...");
    }

}
