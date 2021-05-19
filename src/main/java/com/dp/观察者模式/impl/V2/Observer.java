package com.dp.观察者模式.impl.V2;

/**
 * @author by catface
 * @date 2021/5/19 10:24 上午
 */
public interface Observer {

    /**
     * 对观察事件的响应
     * @param event 事件
     */
    void doSomething(ObserveEvent event);
}
