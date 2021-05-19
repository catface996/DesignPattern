package com.dp.观察者模式.impl.V1;

import org.junit.Test;

/**
 * @author by catface
 * @date 2021/5/19 10:23 上午
 */
public class BabyTest {

    @Test
    public void wakeUp() {
        Baby baby = new Baby();
        baby.addObserver(new Dad());
        baby.addObserver(new Mum());

        baby.wakeUp();
    }
}