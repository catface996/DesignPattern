package com.dp.责任链模式.V4;

import lombok.extern.slf4j.Slf4j;

/**
 * @author by catface
 * @date 2021/5/18 10:33 上午
 */
@Slf4j
public class ErrorLogFilter implements Filter {
    /**
     * 处理消息
     *
     * @param request  请求
     * @param response 响应
     */
    @Override
    public boolean doFilter(String request, String response, FilterChain chain) {
        log.error("request:{},错误级别的日志...", request);
        chain.doFilter(request, response, chain);
        log.error("response:{},错误级别的日志...", response);
        return true;
    }
}
