package com.dp.工厂模式.bean.原始社会;

import com.dp.工厂模式.bean.Food;
import com.dp.工厂模式.bean.Human;
import com.dp.工厂模式.bean.Residences;
import com.dp.工厂模式.bean.现代社会.Bread;
import com.dp.工厂模式.bean.现代社会.Department;
import com.dp.工厂模式.behavior.Eat;

/**
 * 原始人
 *
 * @author by catface
 * @date 2021/5/13 4:56 下午
 */
public class PrimitiveMan extends Human implements Eat {

    // 原始人啥都没有

    /**
     * 吃
     *
     * @param food 食物
     */
    @Override
    public void eatFood(Food food) {
        if (food instanceof Bread) {
            System.out.println("想得美,还想吃面包...");
            return;
        }
        if (food instanceof WildFruit) {
            System.out.println("吃吧吃吧,吃完去打猎...");
        }
    }

    /**
     * 在住处睡觉
     *
     * @param residences 住处
     */
    @Override
    public void sleepIn(Residences residences) {
        if (residences instanceof Cave) {
            System.out.println("天黑了,好恐怖,堵上洞口防范野兽...");
            return;
        }
        if (residences instanceof Department) {
            System.out.println("想得美,有山洞住就不错了,还想住公寓...");
        }
    }

}
