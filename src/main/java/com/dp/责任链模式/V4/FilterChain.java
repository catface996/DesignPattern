package com.dp.责任链模式.V4;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * @author by catface
 * @date 2021/5/18 10:26 上午
 */
@Slf4j
public class FilterChain implements Filter {

    private List<Filter> filters = new ArrayList<>();
    private int currentFilter = -1;

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    /**
     * 处理消息
     *
     * @param request  请求
     * @param response 响应
     */
    @Override
    public boolean doFilter(String request, String response, FilterChain chain) {
        currentFilter++;
        if (currentFilter >= filters.size()) {
            return true;
        }
        filters.get(currentFilter).doFilter(request, response, this);
        return true;
    }
}
