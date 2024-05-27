package com.psh10066.refactoring._17_message_chain._37_hide_delegate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

    private String name;

    private Department department;

    public Person(String name) {
        this.name = name;
    }

    Person getManager() {
        return this.getDepartment().getManager();
    }
}
