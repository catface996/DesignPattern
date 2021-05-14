package com.dp.装饰器模式;

/**
 * @author by catface
 * @date 2021/5/14 11:14 上午
 */
public class Circle extends Shape{
    /**
     * 绘制
     */
    @Override
    public void draw() {
        System.out.println("画圈圈...");
    }
}
