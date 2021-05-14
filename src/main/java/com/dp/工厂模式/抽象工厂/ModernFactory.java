package com.dp.工厂模式.抽象工厂;

import com.dp.工厂模式.bean.Food;
import com.dp.工厂模式.bean.Human;
import com.dp.工厂模式.bean.Residences;
import com.dp.工厂模式.bean.Society;
import com.dp.工厂模式.bean.现代社会.Bread;
import com.dp.工厂模式.bean.现代社会.Department;
import com.dp.工厂模式.bean.现代社会.Modern;
import com.dp.工厂模式.bean.现代社会.ModernSociety;

/**
 * @author by catface
 * @date 2021/5/14 10:26 上午
 */
public class ModernFactory extends AbstractFactory {
    /**
     * 制造人类
     *
     * @return 人类
     */
    @Override
    public Human createHuman() {
        System.out.println("现代工厂开始制造现代人...");
        Human human = new Modern();
        System.out.println("现代工厂制造现代人结束...");
        return human;
    }

    /**
     * 制造食物
     *
     * @return 食物
     */
    @Override
    public Food createFood() {
        System.out.println("现代工厂开始创建面包...");
        Food food = new Bread();
        System.out.println("现代工厂制造面包结束...");
        return food;
    }

    /**
     * 制造住处
     *
     * @return 住处
     */
    @Override
    public Residences createResidences() {
        System.out.println("现代工厂开始制造公寓...");
        Residences residences = new Department();
        System.out.println("现代工厂制造公寓结束...");
        return residences;
    }

    /**
     * 制造社会
     *
     * @return 社会
     */
    @Override
    public Society createSociety() {
        System.out.println("现代工厂开始制造现代社会...");
        Society society = new ModernSociety(createHuman(), createFood(), createResidences());
        System.out.println("现代工厂结束制造现代社会...");
        return society;
    }
}
