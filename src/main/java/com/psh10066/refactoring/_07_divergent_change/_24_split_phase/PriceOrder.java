package com.psh10066.refactoring._07_divergent_change._24_split_phase;

public class PriceOrder {

    public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
//        final double basePrice = product.basePrice() * quantity;
//        final double discount = Math.max(quantity - product.discountThreshold(), 0)
//            * product.basePrice() * product.discountRate();
//        final double shippingPerCase = (basePrice > shippingMethod.discountThreshold()) ?
//            shippingMethod.discountedFee() : shippingMethod.feePerCase();
//        final double shippingCost = quantity * shippingPerCase;
//        final double price = basePrice - discount + shippingCost;
//        return price;

        final PriceData priceData = calculatePriceData(product, quantity);
        return applyShipping(priceData, shippingMethod);
    }

    private PriceData calculatePriceData(Product product, int quantity) {
        final double basePrice = product.basePrice() * quantity;
        final double discount = Math.max(quantity - product.discountThreshold(), 0)
            * product.basePrice() * product.discountRate();
        final PriceData priceData = new PriceData(basePrice, discount, quantity);
        return priceData;
    }

    private double applyShipping(PriceData priceData, ShippingMethod shippingMethod) {
        final double shippingPerCase = (priceData.basePrice() > shippingMethod.discountThreshold()) ?
            shippingMethod.discountedFee() : shippingMethod.feePerCase();
        final double shippingCost = priceData.quantity() * shippingPerCase;
        final double price = priceData.basePrice() - priceData.discount() + shippingCost;
        return price;
    }
}
