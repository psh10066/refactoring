package com.psh10066.refactoring._07_divergent_change._26_extract_class;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Person {

    private String name;

//    private String officeAreaCode;
//
//    private String officeNumber;
//
//    public String telephoneNumber() {
//        return this.officeAreaCode + " " + this.officeNumber;
//    }

    private TelephoneNumber telephoneNumber;

    public String telephoneNumber() {
        return this.telephoneNumber.toString();
    }
}
