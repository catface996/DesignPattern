package com.dp.责任链模式.V2;

/**
 * @author by catface
 * @date 2021/5/18 10:27 上午
 */
public class InfoLogFilter implements Filter {
    /**
     * 处理消息
     *
     * @param message 消息体
     */
    @Override
    public void doFilter(String message) {
        System.out.println("message:" + message + "info级别的日志...");
    }
}
