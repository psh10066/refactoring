package com.psh10066.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance;

import lombok.Getter;

@Getter
public abstract class Employee {

    private String name;

//    private String type;

//    public Employee(String name, String type) {
//        this.validate(type);
//        this.name = name;
//        this.type = type;
//    }

//    private void validate(String type) {
//        List<String> legalTypes = List.of("engineer", "manager", "salesman");
//        if (!legalTypes.contains(type)) {
//            throw new IllegalArgumentException(type);
//        }
//    }

    protected Employee(String name) {
        this.name = name;
    }

    protected abstract String getType();

    public static Employee createEmployee(String name, String type) {
        return switch (type) {
            case "engineer" -> new Engineer(name);
            case "manager" -> new Manager(name);
            case "salesman" -> new Salesman(name);
            default -> throw new IllegalArgumentException(type);
        };
    }

    @Override
    public String toString() {
        return "Employee{" +
            "name='" + name + '\'' +
            ", type='" + getType() + '\'' +
            '}';
    }
}
