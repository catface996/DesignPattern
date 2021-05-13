package com.dp.工厂模式.简单工厂;

import com.dp.工厂模式.bean.Food;
import com.dp.工厂模式.bean.SocietyState;
import com.dp.工厂模式.bean.原始社会.WildFruit;
import com.dp.工厂模式.bean.现代社会.Bread;

/**
 * @author by catface
 * @date 2021/5/13 5:14 下午
 */
public class FoodFactory {

    public static Food createFood(SocietyState state) {
        switch (state) {
            case modern:
                return createBread();
            case primitive:
                return createWildFruit();
            default:
                return null;
        }
    }

    private static WildFruit createWildFruit() {
        System.out.println("开始创建野果...");
        WildFruit wildFruit = new WildFruit();
        System.out.println("结束创建野果...");
        return wildFruit;
    }

    private static Bread createBread() {
        System.out.println("开始创建面包...");
        Bread bread = new Bread();
        System.out.println("面包创建结束...");
        return bread;
    }
}
