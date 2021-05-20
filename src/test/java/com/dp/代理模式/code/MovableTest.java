package com.dp.代理模式.code;

import com.dp.代理模式.code.V1.LogProxy;
import com.dp.代理模式.code.V1.Movable;
import com.dp.代理模式.code.V1.Tank;
import com.dp.代理模式.code.V1.TimeProxy;

/**
 * @author by catface
 * @date 2021/5/20 10:22 上午
 */
public class MovableTest {

    public static void main(String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        //System.setProperty("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        Movable movable = new LogProxy(new TimeProxy(new Tank()));
        movable.move();
    }
}