package com.psh10066.refactoring._16_temporary_field._36_introduce_special_case;

public class UnknownCustomer extends Customer {

    public UnknownCustomer() {
        super("unknown", new BasicBillingPlan(), new NullPaymentHistory());
    }

    @Override
    public boolean isUnknown() {
        return true;
    }

    @Override
    public String getName() {
        return "occupant";
    }
}
