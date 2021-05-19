package com.dp.责任链模式.V3;

import org.junit.Test;

/**
 * @author by catface
 * @date 2021/5/18 10:41 上午
 */
public class FilterChainTest {

    @Test
    public void doFilter() {
        com.dp.责任链模式.V3.FilterChain contextFilterChain = new com.dp.责任链模式.V3.FilterChain();
        contextFilterChain.addFilter(new UrlFilter()).addFilter(new ImageFilter()).addFilter(new CharsetFilter());
        com.dp.责任链模式.V3.FilterChain logFilterChain = new FilterChain();
        logFilterChain.addFilter(new InfoLogFilter()).addFilter(new WarningLogFilter()).addFilter(new ErrorLogFilter());
        contextFilterChain.addFilter(logFilterChain);
        contextFilterChain.doFilter("hello");
    }
}