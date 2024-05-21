package com.psh10066.refactoring._06_mutable_data._19_separate_query_from_modifier;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Customer {

    private String name;

    private List<Invoice> invoices;
}
