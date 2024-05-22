package com.psh10066.refactoring._09_feature_envy;

public class Bill {

    private ElectricityUsage electricityUsage;

    private GasUsage gasUsage;

    public double calculateBill() {
//        var electicityBill = electricityUsage.getAmount() * electricityUsage.getPricePerUnit();
//        var gasBill = gasUsage.getAmount() * gasUsage.getPricePerUnit();
//        return electicityBill + gasBill;

        return electricityUsage.getElecticityBill() + gasUsage.getGasBill();
    }
}
