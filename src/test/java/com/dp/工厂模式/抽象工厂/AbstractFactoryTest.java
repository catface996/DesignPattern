package com.dp.工厂模式.抽象工厂;

import com.dp.工厂模式.bean.Society;
import org.junit.Test;

/**
 * @author by catface
 * @date 2021/5/14 10:42 上午
 */
public class AbstractFactoryTest {

    @Test
    public void createSociety() {

        Society primitiveSociety = new PrimitiveFactory().createSociety();
        primitiveSociety.run();
        System.out.println();
        System.out.println(".......经过几万年的发展......");
        System.out.println();
        Society modernSociety = new ModernFactory().createSociety();
        modernSociety.run();

        System.out.println();

    }
}