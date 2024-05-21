package com.psh10066.refactoring._06_mutable_data._22_combine_functions_into_transform;

import lombok.Getter;

@Getter
public class Client3 extends ReadingClient {

    private double basicChargeAmount;

    public Client3(Reading reading) {
//        this.basicChargeAmount = calculateBaseCharge(reading);
        this.basicChargeAmount = super.enrichReading(reading).baseCharge();
    }

//    private double calculateBaseCharge(Reading reading) {
//        return baseRate(reading.month(), reading.year()) * reading.quantity();
//    }
}
