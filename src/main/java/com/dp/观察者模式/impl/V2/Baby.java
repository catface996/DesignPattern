package com.dp.观察者模式.impl.V2;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * @author by catface
 * @date 2021/5/19 10:29 上午
 */
@Slf4j
public class Baby {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void wakeUp(){
        log.info("baby醒了,wawawa......");
        ObserveEvent event = new ObserveEvent();
        event.setSource(this);
        for (Observer observer : observers) {
            observer.doSomething(event);
        }
    }
}
