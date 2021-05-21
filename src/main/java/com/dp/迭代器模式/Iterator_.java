package com.dp.迭代器模式;

/**
 * @author by catface
 * @date 2021/5/21 10:04 上午
 */
public interface Iterator_ {

    /**
     * 是否有下一个元素
     *
     * @return true:有;false:无;
     */
    boolean hasNext();

    /**
     * 下一个元素
     *
     * @return 下一个元素
     */
    Integer next();

}
