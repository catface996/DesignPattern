package com.dp.责任链模式.V1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by catface
 * @date 2021/5/18 10:17 上午
 */
public class Client {

    private List<Filter> filters = new ArrayList<>();

    public Client addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    public void callFilters(String message) {
        for (Filter filter : filters) {
            filter.doFilter(message);
        }
    }
}
