package com.psh10066.refactoring._18_middle_man._40_replace_subclass_with_delegate;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class PremiumExtra {

    private List<String> properties;

    private double premiumFee;

    public boolean hasOwnProperty(String property) {
        return this.properties.contains(property);
    }
}
