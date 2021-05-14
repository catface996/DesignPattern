package com.dp.工厂模式.抽象工厂;

import com.dp.工厂模式.bean.Food;
import com.dp.工厂模式.bean.Human;
import com.dp.工厂模式.bean.Residences;
import com.dp.工厂模式.bean.Society;

/**
 * @author by catface
 * @date 2021/5/14 10:22 上午
 */
public abstract class AbstractFactory {

    /**
     * 制造人类
     *
     * @return 人类
     */
    public abstract Human createHuman();

    /**
     * 制造食物
     *
     * @return 食物
     */
    public abstract Food createFood();

    /**
     * 制造住处
     *
     * @return 住处
     */
    public abstract Residences createResidences();

    /**
     * 制造社会
     *
     * @return 社会
     */
    public abstract Society createSociety();

}
