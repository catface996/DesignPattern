package com.dp.代理模式.code.V1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author by catface
 * @date 2021/5/20 10:15 上午
 */
@Slf4j
public class TimeProxy implements Movable {

    private Movable movable;

    public TimeProxy(Movable movable) {
        this.movable = movable;
    }

    /**
     * 移动
     */
    @Override
    public void move() {
        before();
        movable.move();
        after();
    }

    public void before() {
        log.info("start...{}", System.currentTimeMillis());
    }

    public void after() {
        log.info("end...{}", System.currentTimeMillis());
    }
}
