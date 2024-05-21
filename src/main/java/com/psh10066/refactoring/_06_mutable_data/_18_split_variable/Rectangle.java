package com.psh10066.refactoring._06_mutable_data._18_split_variable;

import lombok.Getter;

@Getter
public class Rectangle {

    private double perimeter;
    private double area;

    public void updateGeometry(double height, double width) {
        // temp 변수를 perimeter, area 변수로 쪼갠다.
        final double perimeter = 2 * (height + width);
        System.out.println("Perimeter: " + perimeter);
        this.perimeter = perimeter;

        final double area = height * width;
        System.out.println("Area: " + area);
        this.area = area;
    }
}
