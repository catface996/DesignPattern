package com.dp.责任链模式.V4;

import lombok.extern.slf4j.Slf4j;

/**
 * @author by catface
 * @date 2021/5/18 10:16 上午
 */
@Slf4j
public class CharsetFilter implements Filter {
    /**
     * 处理消息
     *
     * @param request  请求
     * @param response 响应
     */
    @Override
    public boolean doFilter(String request, String response, FilterChain chain) {
        log.info("request:{},对字符进行过滤...", request);
        chain.doFilter(request, response, chain);
        log.info("response:{},对字符进行过滤", response);
        return true;
    }
}
