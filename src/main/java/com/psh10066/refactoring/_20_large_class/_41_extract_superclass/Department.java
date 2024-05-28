package com.psh10066.refactoring._20_large_class._41_extract_superclass;

import lombok.Getter;

import java.util.List;

@Getter
public class Department extends Party {

//    private String name;

    private List<Employee> staff;

    public Department(String name) {
        super(name);
    }

//    public double annualCost() {
//        return this.monthlyCost() * 12;
//    }

    @Override
    public double monthlyCost() {
        return this.staff.stream().mapToDouble(e -> e.getMonthlyCost()).sum();
    }

    public int headCount() {
        return this.staff.size();
    }
}
