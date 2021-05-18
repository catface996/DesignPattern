package com.dp.责任链模式.V3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by catface
 * @date 2021/5/18 10:26 上午
 */
public class FilterChain implements Filter {

    private List<Filter> filters = new ArrayList<>();

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    /**
     * 处理消息
     *
     * @param message 消息体
     */
    @Override
    public boolean doFilter(String message) {
        for (Filter filter : filters) {
            boolean result = filter.doFilter(message);
            if (!result) {
                return false;
            }
        }
        return true;
    }
}
