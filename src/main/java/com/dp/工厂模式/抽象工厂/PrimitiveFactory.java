package com.dp.工厂模式.抽象工厂;

import com.dp.工厂模式.bean.Food;
import com.dp.工厂模式.bean.Human;
import com.dp.工厂模式.bean.Residences;
import com.dp.工厂模式.bean.Society;
import com.dp.工厂模式.bean.原始社会.Cave;
import com.dp.工厂模式.bean.原始社会.PrimitiveMan;
import com.dp.工厂模式.bean.原始社会.PrimitiveSociety;
import com.dp.工厂模式.bean.原始社会.WildFruit;

/**
 * @author by catface
 * @date 2021/5/14 10:26 上午
 */
public class PrimitiveFactory extends AbstractFactory {
    /**
     * 制造人类
     *
     * @return 人类
     */
    @Override
    public Human createHuman() {
        System.out.println("原始工厂开始制造原始人...");
        Human human = new PrimitiveMan();
        System.out.println("原始工厂制造原始结束...");
        return human;
    }

    /**
     * 制造食物
     *
     * @return 食物
     */
    @Override
    public Food createFood() {
        System.out.println("原始工厂开始制造野果...");
        Food food = new WildFruit();
        System.out.println("原始工厂制造野果结束...");
        return food;
    }

    /**
     * 制造住处
     *
     * @return 住处
     */
    @Override
    public Residences createResidences() {
        System.out.println("原始工厂开始制造洞穴...");
        Residences residences = new Cave();
        System.out.println("原始工厂制造洞穴结束...");
        return residences;
    }

    /**
     * 制造社会
     *
     * @return 社会
     */
    @Override
    public Society createSociety() {
        System.out.println("原始工厂开始制造社会...");
        Society society = new PrimitiveSociety(createHuman(), createFood(), createResidences());
        System.out.println("原始工厂制造社会结束...");
        return society;
    }
}
