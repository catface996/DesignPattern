package com.dp.建造者模式;

import lombok.Data;

/**
 * @author by catface
 * @date 2021/5/21 11:12 上午
 */
@Data
public class Person {

    private int age;
    private String name;

    private int degree;
    private String school;

    private Address address;

    private Person() {

    }

    public static class PersonBuild {

        Person person = new Person();

        public PersonBuild buildBaseInfo(String name, int age) {
            person.age = age;
            person.name = name;
            return this;
        }

        public PersonBuild buildDegree(String school, int degree) {
            person.school = school;
            person.degree = degree;
            return this;
        }

        public PersonBuild buildAddress(String province, String city, String detail) {
            Address address = new Address();
            address.province = province;
            address.city = city;
            address.detail = detail;
            person.address = address;
            return this;
        }

        public Person build() {
            return person;
        }
    }

    @Data
    private static class Address {
        private String province;
        private String city;
        private String detail;
    }
}
