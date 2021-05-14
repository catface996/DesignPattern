package com.dp.装饰器模式;

/**
 * @author by catface
 * @date 2021/5/14 11:23 上午
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    /**
     * 绘制
     */
    @Override
    public void draw() {
        super.draw();
        red();
    }

    private void red() {
        System.out.println("这是个红色图形...");
    }
}
