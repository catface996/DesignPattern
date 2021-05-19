package com.dp.观察者模式.impl.V2;

import lombok.extern.slf4j.Slf4j;

/**
 * @author by catface
 * @date 2021/5/19 10:26 上午
 */
@Slf4j
public class Dad implements Observer {
    /**
     * 对观察事件的响应
     *
     * @param event 事件
     */
    @Override
    public void doSomething(ObserveEvent event) {
        if (event.getSource() instanceof Baby) {
            log.info("观察到baby醒了..");
            feed();
            return;
        }
        if (event.getSource() instanceof Dog){
            log.info("观潮到小狗醒了..");
            walkingDog();
        }
    }

    private void feed() {
        log.info("给baby喂奶...");
    }

    private void walkingDog(){
        log.info("遛狗...");
    }
}
