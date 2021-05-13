package com.dp.工厂模式.bean.现代社会;

import com.dp.工厂模式.bean.Food;
import com.dp.工厂模式.bean.Human;
import com.dp.工厂模式.bean.Residences;
import com.dp.工厂模式.bean.原始社会.Cave;
import com.dp.工厂模式.bean.原始社会.WildFruit;
import com.dp.工厂模式.behavior.Eat;

/**
 * @author by catface
 * @date 2021/5/13 5:03 下午
 */
public class Modern extends Human implements Eat {

    /**
     * 身份证号
     */
    private String idNo;

    /**
     * 学历
     */
    private Degree degree;

    /**
     * 吃
     *
     * @param food 食物
     */
    @Override
    public void eatFood(Food food) {
        if (food instanceof Bread){
            System.out.println("又吃面包,我想吃火腿...");
            return;
        }
        if (food instanceof WildFruit){
            System.out.println("野果有毒,小心拉肚子,我不吃我不吃...");
        }
    }

    /**
     * 在住处睡觉
     *
     * @param residences 住处
     */
    @Override
    public void sleepIn(Residences residences) {
        if (residences instanceof Cave){
            System.out.println("现代人住洞穴,体验生活的吧...");
            return;
        }
        if (residences instanceof Department){
            System.out.println("防火防盗防闺蜜...");
        }
    }
}
