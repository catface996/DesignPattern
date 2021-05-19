package com.dp.观察者模式.impl.V1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author by catface
 * @date 2021/5/19 10:16 上午
 */
@Slf4j
public class Mum implements Observer{

    /**
     * 观察到
     */
    @Override
    public void doSomething() {
        log.info("观察到baby醒了...");
        hug();
    }

    private void hug(){
        log.info("妈妈抱一抱...");
    }
}
