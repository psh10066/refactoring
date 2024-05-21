package com.psh10066.refactoring._06_mutable_data._19_separate_query_from_modifier;

import java.util.List;

public class Criminal {

//    public String alertForMiscreant(List<Person> people) {
//        for (Person p : people) {
//            if (p.getName().equals("Don")) {
//                setOffAlarms();
//                return "Don";
//            }
//
//            if (p.getName().equals("John")) {
//                setOffAlarms();
//                return "John";
//            }
//        }
//
//        return "";
//    }

    public void alertForMiscreant(List<Person> people) {
        if (!this.findMiscreant(people).isBlank()) {
            setOffAlarms();
        }
    }

    public String findMiscreant(List<Person> people) {
        for (Person p : people) {
            if (p.getName().equals("Don")) {
                return "Don";
            }

            if (p.getName().equals("John")) {
                return "John";
            }
        }

        return "";
    }

    private void setOffAlarms() {
        System.out.println("set off alarm");
    }
}
