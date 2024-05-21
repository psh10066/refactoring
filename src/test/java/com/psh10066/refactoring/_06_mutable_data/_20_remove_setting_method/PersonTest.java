package com.psh10066.refactoring._06_mutable_data._20_remove_setting_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void person() {
//        Person person = new Person();
//        person.setId(10);
        Person person = new Person(10);
        person.setName("hojun");
        assertEquals(10, person.getId());
        assertEquals("hojun", person.getName());
        person.setName("test");
        assertEquals("test", person.getName());
    }
}