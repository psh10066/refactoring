package com.psh10066.refactoring._17_message_chain._37_hide_delegate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Department {

    private String chargeCode;

    private Person manager;
}
