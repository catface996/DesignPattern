package com.dp.单例模式.锁实现;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

/**
 * @author by catface
 * @date 2021/5/13 2:28 下午
 */
public class SingletonTest {

    @Test
    public void getInstance() {
        Map<Singleton, Integer> beanMap = new ConcurrentHashMap<>();
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Singleton singleton = Singleton.getInstance();
                beanMap.put(singleton, singleton.hashCode());
            }).start();
        }
        System.out.println(beanMap.size());
        if (beanMap.size() != 1) {
            System.out.println("完犊子了...");
        }
        assert beanMap.size() == 1;
        System.out.println("锁实现验证通过...");
    }
}