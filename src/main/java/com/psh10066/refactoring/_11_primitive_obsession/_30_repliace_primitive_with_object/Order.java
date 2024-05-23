package com.psh10066.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Order {

//    private String priority;

    private Priority priority;

    public Order(String priorityValue) {
        this(new Priority(priorityValue));
    }
}
