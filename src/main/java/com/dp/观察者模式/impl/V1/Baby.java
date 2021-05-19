package com.dp.观察者模式.impl.V1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by catface
 * @date 2021/5/19 10:07 上午
 */
public class Baby {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void wakeUp(){
        System.out.println("Crying,wa,wa,wa......");
        for (Observer observer : observers) {
            observer.doSomething();
        }
    }
}
