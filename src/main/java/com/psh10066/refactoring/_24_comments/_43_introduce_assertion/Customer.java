package com.psh10066.refactoring._24_comments._43_introduce_assertion;

import lombok.Getter;

@Getter
public class Customer {

    private Double discountRate;

    public double applyDiscount(double amount) {
        return (this.discountRate != null) ? amount - (this.discountRate * amount) : amount;
    }

    public void setDiscountRate(Double discountRate) {
        // assert는 런타임 시에는 사라지고, 테스트 시에만 적용된다. 활성/비활성 여부를 변경할 수 있다.
        assert discountRate != null && discountRate > 0;
        this.discountRate = discountRate;
    }
}
