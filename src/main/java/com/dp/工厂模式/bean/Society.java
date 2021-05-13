package com.dp.工厂模式.bean;

/**
 * @author by catface
 * @date 2021/5/13 5:33 下午
 */
public class Society {

    private Human human;
    private Food food;
    private Residences residences;

    public Society(Human human, Food food, Residences residences) {
        this.human = human;
        this.food = food;
        this.residences = residences;
    }

    public void run() {
        human.eatFood(food);
        human.sleepIn(residences);
    }
}
