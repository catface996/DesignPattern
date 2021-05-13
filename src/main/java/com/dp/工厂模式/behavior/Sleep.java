package com.dp.工厂模式.behavior;

import com.dp.工厂模式.bean.Residences;

/**
 * @author by catface
 * @date 2021/5/13 5:37 下午
 */
public interface Sleep {
    /**
     * 在住处睡觉
     *
     * @param residences 住处
     */
    void sleepIn(Residences residences);
}
