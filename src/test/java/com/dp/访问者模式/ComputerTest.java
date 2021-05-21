package com.dp.访问者模式;

import org.junit.Test;

/**
 * @author by catface
 * @date 2021/5/21 11:03 上午
 */
public class ComputerTest {

    @Test
    public void visit(){
        System.out.println();
        Computer computer = new Computer();
        Student student = new Student();
        Teacher teacher = new Teacher();
        System.out.println("学生来购买电脑");
        computer.acceptVisitor(student);
        System.out.println();
        System.out.println("老师来购买电脑");
        computer.acceptVisitor(teacher);
    }

}