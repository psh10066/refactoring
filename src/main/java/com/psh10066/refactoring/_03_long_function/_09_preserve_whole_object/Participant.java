package com.psh10066.refactoring._03_long_function._09_preserve_whole_object;

import java.util.HashMap;
import java.util.Map;

public record Participant(String username, Map<Integer, Boolean> homework) {
    public Participant(String username) {
        this(username, new HashMap<>());
    }

    public double getRate(int total) {
        long count = this.homework().values().stream()
            .filter(v -> v == true)
            .count();
        return (double) (count * 100 / total);
    }

    public void setHomeworkDone(int index) {
        this.homework.put(index, true);
    }
}
