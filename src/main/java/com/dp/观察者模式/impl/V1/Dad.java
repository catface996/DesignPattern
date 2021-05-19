package com.dp.观察者模式.impl.V1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author by catface
 * @date 2021/5/19 10:11 上午
 */
@Slf4j
public class Dad implements Observer {
    /**
     * 观察到
     */
    @Override
    public void doSomething() {
        log.info("观察到baby醒了...");
        this.feed();
    }

    public void feed() {
        log.info("爸爸喂个奶...");
    }
}
