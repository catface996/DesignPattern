package com.dp.工厂模式.简单工厂;

import com.dp.工厂模式.bean.Society;
import com.dp.工厂模式.bean.SocietyState;
import org.junit.Test;

/**
 * @author by catface
 * @date 2021/5/13 7:13 下午
 */
public class SocietyFactoryTest {

    @Test
    public void createPrimitiveSociety() {
        Society society = SocietyFactory.createSociety(SocietyState.primitive);
        society.run();
    }

    @Test
    public void createModernSociety() {
        Society society = SocietyFactory.createSociety(SocietyState.modern);
        society.run();
    }
}