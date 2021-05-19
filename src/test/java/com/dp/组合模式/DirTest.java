package com.dp.组合模式;

import org.junit.Test;

/**
 * @author by catface
 * @date 2021/5/19 5:58 下午
 */
public class DirTest {

    @Test
    public void print() {
        Dir root = new Dir("root");
        Dir l11 = new Dir("l11");
        Dir l12 = new Dir("l12");
        Dir l111 = new Dir("l111");
        Dir l112 = new Dir("l112");
        Dir l121 = new Dir("l121");
        Dir l122 = new Dir("l122");
        root.add(l11);
        root.add(l12);

        l11.add(l111);
        l11.add(l112);

        l12.add(l121);
        l12.add(l122);

        root.print(1);
    }
}