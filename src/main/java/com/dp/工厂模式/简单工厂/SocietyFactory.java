package com.dp.工厂模式.简单工厂;

import com.dp.工厂模式.bean.Food;
import com.dp.工厂模式.bean.Human;
import com.dp.工厂模式.bean.Residences;
import com.dp.工厂模式.bean.原始社会.PrimitiveSociety;
import com.dp.工厂模式.bean.现代社会.ModernSociety;

/**
 * @author by catface
 * @date 2021/5/13 7:04 下午
 */
public class SocietyFactory {

    public static PrimitiveSociety createPrimitiveSociety() {
        System.out.println("开始创建原始社会...");
        Human human = HumanFactory.createPrimitiveMan();
        Food food = FoodFactory.createWildFruit();
        Residences residences = ResidencesFactory.createCave();
        PrimitiveSociety primitiveSociety = new PrimitiveSociety(human, food, residences);
        System.out.println("原始社会创建完成...");
        return primitiveSociety;
    }

    public static ModernSociety createModernSociety() {
        System.out.println("开始创建现代社会...");
        Human human = HumanFactory.createModern();
        Food food = FoodFactory.createBread();
        Residences residences = ResidencesFactory.createDepartment();
        ModernSociety modernSociety = new ModernSociety(human, food, residences);
        System.out.println("现代社会创建完成...");
        return modernSociety;
    }
}
