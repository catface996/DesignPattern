package com.dp.代理模式.code.V2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author by catface
 * @date 2021/5/20 10:31 上午
 */
@Slf4j
public class DynamicProxy {

    private final Movable tank;

    public DynamicProxy(Movable movable) {
        this.tank = movable;
    }

    public void run() {
        Movable movable = (Movable)Proxy.newProxyInstance(
            Tank.class.getClassLoader(),
            new Class[] {Movable.class}, new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    log.info("before...{}", System.currentTimeMillis());
                    tank.move();
                    log.info("after...{}", System.currentTimeMillis());
                    return null;
                }
            });
        movable.move();
    }
}
