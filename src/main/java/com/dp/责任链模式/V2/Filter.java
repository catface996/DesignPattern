package com.dp.责任链模式.V2;

/**
 * @author by catface
 * @date 2021/5/18 10:11 上午
 */
public interface Filter {

    /**
     * 处理消息
     *
     * @param message 消息体
     */
    void doFilter(String message);
}
