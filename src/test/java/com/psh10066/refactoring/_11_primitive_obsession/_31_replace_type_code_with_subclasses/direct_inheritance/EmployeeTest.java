package com.psh10066.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmployeeTest {

    @Test
    void employeeType() {
        assertEquals("engineer", Employee.createEmployee("hojun", "engineer").getType());
        assertEquals("manager", Employee.createEmployee("hojun", "manager").getType());
        assertThrows(IllegalArgumentException.class, () -> Employee.createEmployee("hojun", "wrong type"));
    }
}