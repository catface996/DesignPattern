# 责任链模式

https://www.runoob.com/design-pattern/chain-of-responsibility-pattern.html

## V1

* 简单版本,用数List存储每个责任节点

## V2

* 抽象一个责任链节点,每个节负责一组责任

## V3

* 任务在责任链传递过程中,会在某个环节中断,不再继续向下传递

* 责任链节点可以互相连接

## V4

模拟SpringMVC的拦截器
