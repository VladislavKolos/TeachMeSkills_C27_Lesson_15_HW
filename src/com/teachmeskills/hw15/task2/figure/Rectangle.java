package com.teachmeskills.hw15.task2.figure;

/**
 * Class for the rectangle figures type
 * contains fields length and width
 * contains constructor
 * contains one required method: calculate perimeter.
 */
public final class Rectangle extends Figure {
    public double length;
    public double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculatePerimeter(double perimeter) {
        if (this.length <= 0 || this.width <= 0) {
            System.out.println("Object parameters are incorrect");
        } else {
            perimeter = (this.length + this.width) * 2;
            System.out.println("The perimeter is: " + perimeter);
        }
    }
}
