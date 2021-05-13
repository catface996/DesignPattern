package com.dp.工厂模式.bean.原始社会;

import com.dp.工厂模式.bean.Food;
import com.dp.工厂模式.bean.Human;
import com.dp.工厂模式.bean.Residences;
import com.dp.工厂模式.bean.Society;

/**
 * @author by catface
 * @date 2021/5/13 7:06 下午
 */
public class PrimitiveSociety extends Society {
    public PrimitiveSociety(Human human, Food food, Residences residences) {
        super(human, food, residences);
    }

    @Override
    public void run() {
        super.run();
        developMagic();
    }

    private void developMagic() {
        System.out.println("发展巫术....");
    }
}
