package com.psh10066.refactoring._06_mutable_data._20_remove_setting_method;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Person {

    private int id;

    @Setter
    private String name;

    public Person(int id) {
        this.id = id;
    }
}
