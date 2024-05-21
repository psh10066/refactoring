package com.psh10066.refactoring._06_mutable_data._18_split_variable;

public class Order {

    public double discount(double inputValue, int quantity) {
//        if (inputValue > 50) inputValue = inputValue - 2;
//        if (quantity > 100) inputValue = inputValue - 1;
//        return inputValue;

        double result = inputValue;

        if (inputValue > 50) result -= 2;
        if (quantity > 100) result -= 1;

        return result;
    }
}
