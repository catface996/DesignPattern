package com.dp.工厂模式.简单工厂;

import com.dp.工厂模式.bean.Human;
import com.dp.工厂模式.bean.SocietyState;
import com.dp.工厂模式.bean.原始社会.PrimitiveMan;
import com.dp.工厂模式.bean.现代社会.Modern;

/**
 * @author by catface
 * @date 2021/5/13 5:14 下午
 */
public class HumanFactory {

    public static Human createHuman(SocietyState state) {
        switch (state) {
            case modern:
                return createModern();
            case primitive:
                return createPrimitiveMan();
            default:
                return null;
        }
    }

    private static PrimitiveMan createPrimitiveMan() {
        System.out.println("开始创建原始人....");
        PrimitiveMan primitiveMan = new PrimitiveMan();
        System.out.println("结束创建原始人...");
        return primitiveMan;
    }

    private static Modern createModern() {
        System.out.println("开始创建现代人...");
        Modern modern = new Modern();
        System.out.println("现代人创建结束...");
        return modern;
    }

}
