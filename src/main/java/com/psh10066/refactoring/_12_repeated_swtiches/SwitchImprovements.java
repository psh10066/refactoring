package com.psh10066.refactoring._12_repeated_swtiches;

public class SwitchImprovements {

    public int vacationHours(String type) {
//        int result;
//        switch (type) {
//            case "full-time": result = 120;
//            case "part-time": result = 80;
//            case "temporal": result = 32;
//            default: result = 0;
//        }

        int result = switch (type) {
            case "full-time" -> 120;
            case "part-time" -> 80;
            case "temporal" -> 32;
            default -> 0;
        };

        return result;
    }
}
