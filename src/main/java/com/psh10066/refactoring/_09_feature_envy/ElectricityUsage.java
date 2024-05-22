package com.psh10066.refactoring._09_feature_envy;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ElectricityUsage {

    private double amount;

    private double pricePerUnit;

    public double getElecticityBill() {
        return this.getAmount() * this.getPricePerUnit();
    }
}
