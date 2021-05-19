package com.dp.观察者模式.impl.V2;

import lombok.extern.slf4j.Slf4j;

/**
 * @author by catface
 * @date 2021/5/19 10:31 上午
 */
@Slf4j
public class Mum implements Observer {
    /**
     * 对观察事件的响应
     *
     * @param event 事件
     */
    @Override
    public void doSomething(ObserveEvent event) {
        if (event.getSource() instanceof Baby){
            log.info("观察到baby醒了...");
            hug();
            return;
        }
        if (event.getSource() instanceof Dog){
            log.info("观潮到狗狗醒了...");
            openDoor();
        }
    }

    private void hug(){
        log.info("妈妈抱一抱...");
    }

    private void openDoor(){
        log.info("开门放狗...");
    }
}
