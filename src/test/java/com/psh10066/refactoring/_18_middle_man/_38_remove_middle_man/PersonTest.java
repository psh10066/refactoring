package com.psh10066.refactoring._18_middle_man._38_remove_middle_man;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void getManager() {
        Person nick = new Person("nick", null);
        Person hojun = new Person("hojun", new Department(nick));

//        assertEquals(nick, hojun.getManager());
        assertEquals(nick, hojun.getDepartment().getManager());
    }
}