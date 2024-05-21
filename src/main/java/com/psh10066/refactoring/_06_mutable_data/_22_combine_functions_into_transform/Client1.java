package com.psh10066.refactoring._06_mutable_data._22_combine_functions_into_transform;

import lombok.Getter;

@Getter
public class Client1 extends ReadingClient {

    private double baseCharge;

    public Client1(Reading reading) {
//        this.baseCharge = baseRate(reading.month(), reading.year()) * reading.quantity();
        this.baseCharge = super.enrichReading(reading).baseCharge();
    }

//    private double baseRate(Month month, Year year) {
//        return 10;
//    }
}
