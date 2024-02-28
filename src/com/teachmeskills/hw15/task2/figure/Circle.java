package com.teachmeskills.hw15.task2.figure;

import com.teachmeskills.hw15.task2.util.Const;

/**
 * Final class only for the circle figures type
 * contains field radius
 * contains constructor
 * contains one required method: calculate perimeter.
 */
public final class Circle extends Figure {
    public double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void calculatePerimeter(double perimeter) {
        if (this.radius <= 0) {
            System.out.println("Object parameters are incorrect");
        } else {
            perimeter = 2 * Const.PI * this.radius;
            System.out.println("The perimeter is: " + perimeter);
        }
    }

}
