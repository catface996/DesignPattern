package com.dp.装饰器模式;

/**
 * @author by catface
 * @date 2021/5/14 11:23 上午
 */
public class LargeShapeDecorator extends ShapeDecorator{

    public LargeShapeDecorator(Shape shape) {
        super(shape);
    }

    /**
     * 绘制
     */
    @Override
    public void draw() {
        super.draw();
        printSize();
    }

    private void printSize(){
        System.out.println("这是个巨大图形...");
    }
}
