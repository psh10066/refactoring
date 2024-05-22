package com.psh10066.refactoring._08_shotgun_surgery._27_move_field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class CustomerContract {

    private LocalDate startDate;
    private double discountRate;
}
