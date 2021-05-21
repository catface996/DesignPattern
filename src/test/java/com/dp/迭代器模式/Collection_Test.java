package com.dp.迭代器模式;

import org.junit.Test;

/**
 * @author by catface
 * @date 2021/5/21 10:21 上午
 */
public class Collection_Test {

    @Test
    public void toIteratorForArrayList_() {
        Collection_ collection_ = new ArrayList_();
        for (int i = 0; i < 100; i++) {
            collection_.add(i);
        }
        Iterator_ iterator_ = collection_.toIterator();
        for (int i = 0; i < 110; i++) {
            System.out.println(iterator_.hasNext());
            System.out.println(iterator_.next());
        }
    }

    @Test
    public void toIteratorForLinkedList_() {
        Collection_ collection_ = new LinkedList_();
        for (int i = 0; i < 100; i++) {
            collection_.add(i);
        }
        Iterator_ iterator_ = collection_.toIterator();
        for (int i = 0; i < 110; i++) {
            System.out.println(iterator_.hasNext());
            System.out.println(iterator_.next());
        }
    }
}