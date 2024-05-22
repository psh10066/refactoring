package com.psh10066.refactoring._09_feature_envy;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GasUsage {

    private double amount;

    private double pricePerUnit;

    public double getGasBill() {
        return this.getAmount() * this.getPricePerUnit();
    }
}
