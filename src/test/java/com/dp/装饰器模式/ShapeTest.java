package com.dp.装饰器模式;

import org.junit.Test;

/**
 * @author by catface
 * @date 2021/5/14 11:27 上午
 */
public class ShapeTest {

    @Test
    public void draw() {
        Shape circle = new Circle();
        ShapeDecorator largeCircle = new LargeShapeDecorator(circle);
        largeCircle.draw();
        System.out.println();
        System.out.println("另一个图形...");
        System.out.println();
        Shape rectangle = new Rectangle();
        ShapeDecorator redRectangle = new RedShapeDecorator(rectangle);
        ShapeDecorator largeRedRectangle = new LargeShapeDecorator(redRectangle);
        largeRedRectangle.draw();
    }
}