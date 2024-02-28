package com.teachmeskills.hw15.task2.figure;

/**
 * Abstract sealed class only for type of the figures
 * contains field name
 * contains constructor
 * contains one required abstract method: calculate perimeter
 * Overridden method "toString()".
 */
public abstract sealed class Figure permits Circle, Rectangle, Triangle {
    public String name;

    public Figure(String name) {
        this.name = name;
    }

    public abstract void calculatePerimeter(double perimeter);

    @Override
    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                '}';
    }

}
