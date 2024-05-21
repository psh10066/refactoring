package com.psh10066.refactoring._04_long_parameter_list._14_replace_parameter_with_query;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Order {

    private int quantity;

    private double itemPrice;

    public double finalPrice() {
        double basePrice = this.quantity * this.itemPrice;
        return this.discountedPrice(basePrice);
    }

    private int discountLevel() {
        return this.quantity > 100 ? 2 : 1;
    }

    private double discountedPrice(double basePrice) {
        return discountLevel() == 2 ? basePrice * 0.90 : basePrice * 0.95;
    }
}
