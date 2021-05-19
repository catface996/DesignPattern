package com.dp.观察者模式.impl.V2;

import org.junit.Test;

/**
 * @author by catface
 * @date 2021/5/19 10:40 上午
 */
public class DogTest {

    @Test
    public void wakeUp() {
        Dog dog = new Dog();
        dog.addObserver(new Dad());
        dog.addObserver(new Mum());

        dog.wakeUp();
    }
}
