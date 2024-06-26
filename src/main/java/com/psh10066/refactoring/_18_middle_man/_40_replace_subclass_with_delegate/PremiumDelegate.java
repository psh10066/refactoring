package com.psh10066.refactoring._18_middle_man._40_replace_subclass_with_delegate;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PremiumDelegate {

    private Booking host;

    private PremiumExtra extra;

    public boolean hasTalkback() {
        return this.host.show.hasOwnProperty("talkback");
    }

    public double extendBasePrice(double result) {
        return Math.round(result + this.extra.getPremiumFee());
    }

    public boolean hasDinner() {
        return this.extra.hasOwnProperty("dinner") && !this.host.isPeakDay();
    }
}
