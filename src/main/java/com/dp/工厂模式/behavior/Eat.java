package com.dp.工厂模式.behavior;

import com.dp.工厂模式.bean.Food;

/**
 * @author by catface
 * @date 2021/5/13 5:19 下午
 */
public interface Eat {

    /**
     * 吃
     *
     * @param food 食物
     */
    void eatFood(Food food);
}
