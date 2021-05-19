package com.dp.责任链模式.V4;

import org.junit.Test;

/**
 * @author by catface
 * @date 2021/5/18 11:08 上午
 */
public class FilterChainTest {

    @Test
    public void doFilter1() {
        FilterChain contextFilterChain = new FilterChain();
        contextFilterChain.addFilter(new UrlFilter()).addFilter(new ImageFilter()).addFilter(new CharsetFilter());
        FilterChain logFilterChain = new FilterChain();
        logFilterChain.addFilter(new InfoLogFilter()).addFilter(new WarningLogFilter()).addFilter(new ErrorLogFilter());

        contextFilterChain.addFilter(logFilterChain);
        contextFilterChain.doFilter("hello","你好",contextFilterChain);
    }

    @Test
    public void doFilter2() {
        FilterChain contextFilterChain = new FilterChain();
        contextFilterChain.addFilter(new UrlFilter()).addFilter(new ImageFilter()).addFilter(new CharsetFilter());
        FilterChain logFilterChain = new FilterChain();
        logFilterChain.addFilter(new InfoLogFilter()).addFilter(new WarningLogFilter()).addFilter(new ErrorLogFilter());

        contextFilterChain.addFilter(logFilterChain);
        contextFilterChain.doFilter("Good","你好",contextFilterChain);
    }
}