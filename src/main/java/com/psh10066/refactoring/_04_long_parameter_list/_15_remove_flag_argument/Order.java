package com.psh10066.refactoring._04_long_parameter_list._15_remove_flag_argument;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Order {

    private LocalDate placedOn;
    private String deliveryState;
}
