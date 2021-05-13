package com.dp.工厂模式.bean;

import com.dp.工厂模式.behavior.Eat;
import com.dp.工厂模式.behavior.Sleep;

/**
 * @author by catface
 * @date 2021/5/13 4:55 下午
 */
public abstract class Human implements Eat, Sleep {
    /**
     * 年龄
     */
    private int age;
    /**
     * 性别
     */
    private boolean gender;

    /**
     * 吃食物
     *
     * @param food 食物
     */
    @Override
    public abstract void eatFood(Food food);

    /**
     * 在住处睡觉
     *
     * @param residences 住处
     */
    @Override
    public abstract void sleepIn(Residences residences);
}
