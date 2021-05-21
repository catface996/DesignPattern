package com.dp.建造者模式;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author by catface
 * @date 2021/5/21 11:23 上午
 */
@Slf4j
public class PersonTest {

    @Test
    public void buildPerson() {
        Person person = new Person.PersonBuild()
            .buildBaseInfo("hh", 1)
            .buildAddress("省","市","详细地址")
            .build();
        log.info("person:{}", person);
    }

}