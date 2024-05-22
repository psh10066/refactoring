package com.psh10066.refactoring._07_divergent_change._26_extract_class;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TelephoneNumber {

    private String areaCode;
    private String number;

    @Override
    public String toString() {
        return this.areaCode + " " + this.number;
    }
}