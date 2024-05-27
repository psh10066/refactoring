package com.psh10066.refactoring._16_temporary_field._36_introduce_special_case;

public class CustomerService {

//    public String customerName(Site site) {
//        Customer customer = site.getCustomer();
//
//        String customerName;
//        if (customer.getName().equals("unknown")) {
//            customerName = "occupant";
//        } else {
//            customerName = customer.getName();
//        }
//
//        return customerName;
//    }

    public String customerName(Site site) {
        return site.getCustomer().getName();
    }

//    public BillingPlan billingPlan(Site site) {
//        Customer customer = site.getCustomer();
//        return customer.getName().equals("unknown") ? new BasicBillingPlan() : customer.getBillingPlan();
//    }

    public BillingPlan billingPlan(Site site) {
        return site.getCustomer().getBillingPlan();
    }

//    public int weeksDelinquent(Site site) {
//        Customer customer = site.getCustomer();
//        return customer.getName().equals("unknown") ? 0 : customer.getPaymentHistory().getWeeksDelinquentInLastYear();
//    }

    public int weeksDelinquent(Site site) {
        return site.getCustomer().getPaymentHistory().getWeeksDelinquentInLastYear();
    }
}
