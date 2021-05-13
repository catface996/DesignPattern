package com.dp.工厂模式.简单工厂;

import com.dp.工厂模式.bean.原始社会.Cave;
import com.dp.工厂模式.bean.现代社会.Department;

/**
 * @author by catface
 * @date 2021/5/13 6:59 下午
 */
public class ResidencesFactory {

    public static Cave createCave() {
        System.out.println("开始创建cave...");
        Cave cave = new Cave();
        System.out.println("结束创建cave...");
        return cave;
    }

    public static Department createDepartment() {
        System.out.println("开始创建公寓...");
        Department department = new Department();
        System.out.println("创建公寓结束...");
        return department;
    }
}
