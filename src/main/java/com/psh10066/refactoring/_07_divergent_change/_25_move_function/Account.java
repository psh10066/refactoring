package com.psh10066.refactoring._07_divergent_change._25_move_function;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Account {

    private int daysOverdrawn;

    private AccountType type;

    public double getBankCharge() {
        double result = 4.5;
        if (this.daysOverdrawn > 0) {
//            result += this.overdraftCharge();
            result += this.type.overdraftCharge(this.daysOverdrawn);
        }
        return result;
    }

//    private double overdraftCharge() {
//        if (this.type.isPremium()) {
//            final int baseCharge = 10;
//            if (this.daysOverdrawn <= 7) {
//                return baseCharge;
//            } else {
//                return baseCharge + (this.daysOverdrawn - 7) * 0.85;
//            }
//        } else {
//            return this.daysOverdrawn * 1.75;
//        }
//    }

}
