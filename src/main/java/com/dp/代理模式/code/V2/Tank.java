package com.dp.代理模式.code.V2;

import java.util.concurrent.TimeUnit;

import lombok.extern.slf4j.Slf4j;

/**
 * @author by catface
 * @date 2021/5/20 10:26 上午
 */
@Slf4j
public class Tank implements Movable {

    /**
     * 移动
     */
    @Override
    public void move() {
        log.info("Tank moving,hong...hong...hong...");
        try {
            TimeUnit.SECONDS.sleep((int)(Math.random() * 10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
