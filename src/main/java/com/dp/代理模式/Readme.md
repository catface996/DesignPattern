# 代理模式

## 静态代理

* 代码在编译前已经编写好代理和被代理关系

## 动态代理

* 代码编译后,仍旧可以通过动态修改class文件来设置代理和被代理关系

### JDK动态代理

~~~java
java.lang.reflect.Proxy.newProxyInstance(
    ClassLoader loader,
    Class<?>[] interfaces,
    InvocationHandler h);
// 此方法需要指定生成的代理对象需要实现哪些接口
// JDK动态代理,底层是通过asm修改字节码来实现
~~~

PS: 

jdk8及之前：System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
jdk8之后：System.setProperty("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");

