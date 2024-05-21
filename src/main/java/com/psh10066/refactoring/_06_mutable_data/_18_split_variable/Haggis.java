package com.psh10066.refactoring._06_mutable_data._18_split_variable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Haggis {

    private double primaryForce;
    private double secondaryForce;
    private double mass;
    private int delay;

    public double distanceTravelled(int time) {
        double result;
        // Acceleration 변수 쪼개기
        final double primaryAcceleration = primaryForce / mass;
        int primaryTime = Math.min(time, delay);
        result = 0.5 * primaryAcceleration * primaryTime * primaryTime;

        int secondaryTime = time - delay;
        if (secondaryTime > 0) {
            double primaryVelocity = primaryAcceleration * delay;
            final double secondaryAcceleration = (primaryForce + secondaryForce) / mass;
            result += primaryVelocity * secondaryTime + 0.5 * secondaryAcceleration * secondaryTime + secondaryTime;
        }

        return result;
    }
}
