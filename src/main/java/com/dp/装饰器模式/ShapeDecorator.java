package com.dp.装饰器模式;

/**
 * @author by catface
 * @date 2021/5/14 11:17 上午
 */
public class ShapeDecorator extends Shape {

    private Shape decoratedShape;

    public ShapeDecorator(Shape shape) {
        this.decoratedShape = shape;
    }

    /**
     * 绘制
     */
    @Override
    public void draw() {
        decoratedShape.draw();
    }

}
