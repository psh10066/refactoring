package com.psh10066.refactoring._08_shotgun_surgery._29_inline_class;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Shipment {

//    private TrackingInformation trackingInformation;

    private String shippingCompany;

    private String trackingNumber;

    public String getTrackingInfo() {
//        return this.trackingInformation.display();
        return this.shippingCompany + ": " + this.trackingNumber;
    }
}
