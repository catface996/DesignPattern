package com.dp.观察者模式.impl.V2;

import lombok.Data;

/**
 * @author by catface
 * @date 2021/5/19 10:24 上午
 */
@Data
public class ObserveEvent {
    private int value;
    private String desc;
    private Object source;
}
