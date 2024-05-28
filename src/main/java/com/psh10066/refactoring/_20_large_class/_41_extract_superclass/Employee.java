package com.psh10066.refactoring._20_large_class._41_extract_superclass;

import lombok.Getter;

@Getter
public class Employee extends Party {

    private Integer id;

//    private String name;

    private double monthlyCost;

    public Employee(String name) {
        super(name);
    }

//    public double annualCost() {
//        return this.monthlyCost * 12;
//    }

    @Override
    double monthlyCost() {
        return monthlyCost;
    }
}
