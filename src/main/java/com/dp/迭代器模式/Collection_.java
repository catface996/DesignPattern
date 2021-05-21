package com.dp.迭代器模式;

/**
 * @author by catface
 * @date 2021/5/21 10:02 上午
 */
public interface Collection_ {

    /**
     * 添加元素
     *
     * @param value 待添加元素
     */
    void add(Integer value);

    /**
     * 转换成迭代器
     * @return 迭代器
     */
    Iterator_ toIterator();

}
