package com.dp.责任链模式.V3;

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
    public boolean doFilter(String message) {
        System.out.println("message:" + message + "info级别的日志...");
        if ("hello".equals(message)) {
            System.out.println("处理失败,无需继续处理..");
            return false;
        }
        return true;
    }
}
