package com.psh10066.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

import java.util.List;

public class OrderProcessor {

    public long numberOfHighPriorityOrders(List<Order> orders) {
        return orders.stream()
//            .filter(o -> o.getPriority() == "high" || o.getPriority() == "rush")
            .filter(o -> o.getPriority().higherThan(new Priority("normal")))
            .count();
    }
}
