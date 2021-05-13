# 策略模式

又称为 Policy 模式

## 在JDK中的应用

~~~java
/**
 * 比较器的实现就是策略模式
 **/
java.util.Comparator;
    java.util.Collections.sort(java.util.List<T>,java.util.Comparator<? super T>);
~~~

## 类图

策略模式:

![image-20210513155145413](https://tva1.sinaimg.cn/large/008i3skNly1gqguompkypj31a40s4q4w.jpg)

Collections实现学生老师排序,老师可以根据自然年龄和工龄排序:

![image-20210513161621734](https://tva1.sinaimg.cn/large/008i3skNly1gqgve3yf2gj31oi0tawhq.jpg)

## 注意

java.lang.Comparable 不是策略模式 相比Comparable,Comparator可以实现对同一个类的不同排序策略,而Comparable只能固定实现一种.

