package com.teachmeskills.hw15.task2.figure;

/**
 * Class for the triangle figures type
 * contains fields sideH, height, sideFirst, sideSecond
 * contains constructor
 * contains one required method: calculate perimeter.
 */
public final class Triangle extends Figure {
    public double sideH;
    public double height;
    public double sideFirst;
    public double sideSecond;

    public Triangle(String name, double sideH, double height, double sideFirst, double sideSecond) {
        super(name);
        this.sideH = sideH;
        this.height = height;
        this.sideFirst = sideFirst;
        this.sideSecond = sideSecond;
    }

    @Override
    public void calculatePerimeter(double perimeter) {
        if (this.sideH <= 0 || this.sideFirst <= 0 || this.sideSecond <= 0) {
            System.out.println("Object parameters are incorrect");
        } else {
            perimeter = this.sideH + this.sideFirst + this.sideSecond;
            System.out.println("The perimeter is: " + perimeter);
        }
    }
}
