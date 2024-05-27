package com.psh10066.refactoring._17_message_chain._37_hide_delegate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void manager() {
        Person hojun = new Person("hojun");
        Person nick = new Person("nick");
        hojun.setDepartment(new Department("m365deploy", nick));

//        Person manager = hojun.getDepartment().getManager();
        Person manager = hojun.getManager();

        assertEquals(nick, manager);
    }
}