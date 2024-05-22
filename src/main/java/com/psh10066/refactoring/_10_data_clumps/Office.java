package com.psh10066.refactoring._10_data_clumps;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Office {

    private String location;

//    private String officeAreaCode;
//
//    private String officeNumber;
//
//    public String officePhoneNumber() {
//        return officeAreaCode + "-" + officeNumber;
//    }

    private TelephoneNumber officePhoneNumber;

    public String officePhoneNumber() {
        return this.officePhoneNumber.toString();
    }
}
