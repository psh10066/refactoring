package com.psh10066.refactoring._06_mutable_data._19_separate_query_from_modifier;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Billing {

    private Customer customer;

    private EmailGateway emailGateway;

    // totalOutstanding과 sendBill 분리
    public double totalOutstanding() {
        return customer.getInvoices().stream()
            .map(Invoice::getAmount)
            .reduce((double) 0, Double::sum);
    }

    public void sendBill() {
        emailGateway.send(formatBill(customer));
    }

    private String formatBill(Customer customer) {
        return "sending bill for " + customer.getName();
    }
}
