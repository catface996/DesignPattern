package com.dp.迭代器模式;

/**
 * @author by catface
 * @date 2021/5/21 10:05 上午
 */
public class ArrayList_ implements Collection_ {

    private Integer[] elements;
    private int index;

    public ArrayList_() {
        elements = new Integer[16];
        index = 0;
    }

    /**
     * 添加元素
     *
     * @param value 待添加元素
     */
    @Override
    public void add(Integer value) {
        if (index >= elements.length) {
            Integer[] newElements = new Integer[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[index] = value;
        index++;
    }

    /**
     * 转换成迭代器
     *
     * @return 迭代器
     */
    @Override
    public Iterator_ toIterator() {
        return new Itr();
    }

    private class Itr implements Iterator_ {

        private int cur = 0;

        /**
         * 是否有下一个元素
         *
         * @return true:有;false:无;
         */
        @Override
        public boolean hasNext() {
            return cur < index;
        }

        /**
         * 下一个元素
         *
         * @return 下一个元素
         */
        @Override
        public Integer next() {
            if (hasNext()) {
                Integer value = elements[cur];
                cur++;
                return value;
            }
            return null;
        }
    }
}
