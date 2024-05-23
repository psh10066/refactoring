package com.psh10066.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.indirect_inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmployeeTest {

    @Test
    void capitalizedType() {
        assertEquals("Manager", new FullTimeEmployee("hojun", "manager").capitalizedType());
        assertEquals("Engineer", new PartTimeEmployee("hojun", "engineer").capitalizedType());
        assertThrows(IllegalArgumentException.class, () -> new Employee("hojun", "wrong type"));
    }
}