package com.dp.责任链模式.V3;

/**
 * @author by catface
 * @date 2021/5/18 10:32 上午
 */
public class WarningLogFilter implements Filter {
    /**
     * 处理消息
     *
     * @param message 消息体
     */
    @Override
    public boolean doFilter(String message) {
        System.out.println("message:" + message + ",警告级别的日志...");
        return true;
    }
}
