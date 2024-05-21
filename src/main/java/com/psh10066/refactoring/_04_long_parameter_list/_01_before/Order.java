package com.psh10066.refactoring._04_long_parameter_list._01_before;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Order {

    private int quantity;

    private double itemPrice;

    public double finalPrice() {
        double basePrice = this.quantity * this.itemPrice;
        int discountLevel = this.quantity > 100 ? 2 : 1;
        return this.discountedPrice(basePrice, discountLevel);
    }

    private double discountedPrice(double basePrice, int discountLevel) {
        return discountLevel == 2 ? basePrice * 0.9 : basePrice * 0.95;
    }
}
