package com.psh10066.refactoring._19_insider_trading;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Ticket {

    private LocalDate purchasedDate;

    private boolean prime;

    public boolean isFastPass() {
        LocalDate earlyBirdDate = LocalDate.of(2022, 1, 1);
        return isPrime() && getPurchasedDate().isBefore(earlyBirdDate);
    }
}
