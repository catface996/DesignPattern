package com.dp.责任链模式.V1;

import org.junit.Test;

/**
 * @author by catface
 * @date 2021/5/18 10:22 上午
 */
public class ClientTest {

    @Test
    public void callFilter() {
        Client client = new Client();
        client.addFilter(new ImageFilter())
            .addFilter(new CharsetFilter())
            .addFilter(new UrlFilter());
        client.callFilters("hello");
    }
}