package com.dp.责任链模式.V4;

import lombok.extern.slf4j.Slf4j;

/**
 * @author by catface
 * @date 2021/5/18 10:27 上午
 */
@Slf4j
public class InfoLogFilter implements Filter {
    /**
     * 处理消息
     *
     * @param request  请求
     * @param response 响应
     */
    @Override
    public boolean doFilter(String request, String response, FilterChain chain) {
        log.info("request:{},普通级别的日志...", request);
        if ("hello".equals(request)) {
            log.error("处理失败,无需继续后续处理..");
            return false;
        }
        chain.doFilter(request, response, chain);
        log.info("response:{},普通级别的日志...", response);
        return true;
    }
}
