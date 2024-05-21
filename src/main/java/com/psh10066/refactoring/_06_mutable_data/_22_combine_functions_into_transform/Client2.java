package com.psh10066.refactoring._06_mutable_data._22_combine_functions_into_transform;

import lombok.Getter;

@Getter
public class Client2 extends ReadingClient {

    private double base;
    private double taxableCharge;

    public Client2(Reading reading) {
//        this.base = baseRate(reading.month(), reading.year()) * reading.quantity();
//        this.taxableCharge = Math.max(0, this.base - taxThreshold(reading.year()));
        this.base = super.enrichReading(reading).baseCharge();
        this.taxableCharge = super.enrichReading(reading).taxableCharge();
    }

//    private double taxThreshold(Year year) {
//        return 5;
//    }
//
//    private double baseRate(Month month, Year year) {
//        return 10;
//    }
}
