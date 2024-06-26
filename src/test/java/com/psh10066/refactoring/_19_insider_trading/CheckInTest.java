package com.psh10066.refactoring._19_insider_trading;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckInTest {

    @Test
    void isFastPass() {
//        CheckIn checkIn = new CheckIn();
//        assertTrue(checkIn.isFastPass(new Ticket(LocalDate.of(2021, 12, 31), true)));
//        assertFalse(checkIn.isFastPass(new Ticket(LocalDate.of(2021, 12, 31), false)));
//        assertFalse(checkIn.isFastPass(new Ticket(LocalDate.of(2022, 1, 2), true)));

        assertTrue(new Ticket(LocalDate.of(2021, 12, 31), true).isFastPass());
        assertFalse(new Ticket(LocalDate.of(2021, 12, 31), false).isFastPass());
        assertFalse(new Ticket(LocalDate.of(2022, 1, 2), true).isFastPass());
    }
}