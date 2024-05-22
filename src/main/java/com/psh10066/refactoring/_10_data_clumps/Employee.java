package com.psh10066.refactoring._10_data_clumps;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Employee {

    private String name;

//    private String personalAreaCode;
//
//    private String personalNumber;
//
//    public String personalPhoneNumber() {
//        return personalAreaCode + "-" + personalNumber;
//    }

    private TelephoneNumber personalPhoneNumber;

    public String personalPhoneNumber() {
        return this.personalPhoneNumber.toString();
    }
}
