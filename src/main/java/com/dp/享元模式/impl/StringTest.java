package com.dp.享元模式.impl;

/**
 * @author by catface
 * @date 2021/5/20 10:04 上午
 */
public class StringTest {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3.intern());
        System.out.println(s3.intern() == s4.intern());
        //true
        //false
        //false
        //true
        //true
    }
}
