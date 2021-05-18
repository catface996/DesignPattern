package com.dp.责任链模式.V4;

import lombok.extern.slf4j.Slf4j;

/**
 * @author by catface
 * @date 2021/5/18 10:32 上午
 */
@Slf4j
public class WarningLogFilter implements Filter {
    /**
     * 处理消息
     *
     * @param request  请求
     * @param response 响应
     */
    @Override
    public boolean doFilter(String request, String response, FilterChain chain) {
        log.warn("request:{},告警级别日志...", request);
        chain.doFilter(request, response, chain);
        log.warn("response:{},告警级别日志...", response);
        return true;
    }
}
