package com.psh10066.refactoring._16_temporary_field._36_introduce_special_case;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Customer {

    private String name;

    private BillingPlan billingPlan;

    private PaymentHistory paymentHistory;

    public boolean isUnknown() {
        return false;
    }
}
