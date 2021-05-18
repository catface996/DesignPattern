package com.dp.责任链模式.V4;

/**
 * @author by catface
 * @date 2021/5/18 10:11 上午
 */
public interface Filter {

    /**
     * 处理消息
     *
     * @param request  请求
     * @param response 响应
     */
    boolean doFilter(String request, String response,FilterChain chain);
}
