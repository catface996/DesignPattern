package com.dp.工厂模式.bean.现代社会;

import com.dp.工厂模式.bean.Food;
import com.dp.工厂模式.bean.Human;
import com.dp.工厂模式.bean.Residences;
import com.dp.工厂模式.bean.Society;

/**
 * @author by catface
 * @date 2021/5/13 7:03 下午
 */
public class ModernSociety extends Society {
    public ModernSociety(Human human, Food food, Residences residences) {
        super(human, food, residences);
    }

    @Override
    public void run() {
        super.run();
        developScience();
    }

    private void developScience() {
        System.out.println("发展科学...");
    }
}
