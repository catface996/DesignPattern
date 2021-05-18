package com.dp.责任链模式.V1;

/**
 * @author by catface
 * @date 2021/5/18 10:13 上午
 */
public class UrlFilter implements Filter {
    /**
     * 处理消息
     *
     * @param message 消息体
     */
    @Override
    public void doFilter(String message) {
        System.out.println("message:" + message + "对url进行过滤...");
    }
}
