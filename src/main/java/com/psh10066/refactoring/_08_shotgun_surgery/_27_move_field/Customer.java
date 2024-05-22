package com.psh10066.refactoring._08_shotgun_surgery._27_move_field;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
public class Customer {

    private String name;

//    private double discountRate;

    private CustomerContract contract;

    public Customer(String name, double discountRate) {
        this.name = name;
//        this.discountRate = discountRate;
        this.contract = new CustomerContract(this.dateToday(), discountRate);
    }

    public void becomePreferred() {
//        this.discountRate += 0.03;
        this.contract.setDiscountRate(this.contract.getDiscountRate() + 0.03);
        // 다른 작업들
    }

    public double applyDiscount(double amount) {
        BigDecimal value = BigDecimal.valueOf(amount);
//        return value.subtract(value.multiply(BigDecimal.valueOf(this.discountRate))).doubleValue();
        return value.subtract(value.multiply(BigDecimal.valueOf(this.contract.getDiscountRate()))).doubleValue();
    }

    private LocalDate dateToday() {
        return LocalDate.now();
    }
}
