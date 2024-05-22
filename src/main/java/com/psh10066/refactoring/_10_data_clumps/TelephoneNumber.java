package com.psh10066.refactoring._10_data_clumps;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class TelephoneNumber {

    private String areaCode;
    private String number;

    @Override
    public String toString() {
        return this.areaCode + "-" + this.number;
    }
}
