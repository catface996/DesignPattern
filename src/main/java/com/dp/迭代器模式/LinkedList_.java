package com.dp.迭代器模式;

/**
 * @author by catface
 * @date 2021/5/21 10:27 上午
 */
public class LinkedList_ implements Collection_ {

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    /**
     * 添加元素
     *
     * @param value 待添加元素
     */
    @Override
    public void add(Integer value) {
        if (head == null) {
            head = new Node();
            head.value = value;
            tail = head;
            return;
        }
        tail.next = new Node();
        tail = tail.next;
        tail.value = value;
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

    private class Node {
        private Integer value;
        private Node next;
    }

    private class Itr implements Iterator_ {

        Node cur = head;

        /**
         * 是否有下一个元素
         *
         * @return true:有;false:无;
         */
        @Override
        public boolean hasNext() {
            return cur != null;
        }

        /**
         * 下一个元素
         *
         * @return 下一个元素
         */
        @Override
        public Integer next() {
            if (hasNext()) {
                Integer value = cur.value;
                cur = cur.next;
                return value;
            }
            return null;
        }
    }
}
