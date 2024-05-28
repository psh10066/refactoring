package com.psh10066.refactoring._20_large_class._41_extract_superclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Party {
    private String name;

    public double annualCost() {
        return this.monthlyCost() * 12;
    }

    abstract double monthlyCost();
}
