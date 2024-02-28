package com.teachmeskills.hw15.task2.runner;

import com.teachmeskills.hw15.task2.figure.Circle;
import com.teachmeskills.hw15.task2.figure.Figure;
import com.teachmeskills.hw15.task2.figure.Rectangle;
import com.teachmeskills.hw15.task2.figure.Triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Class with method main to run the program
 * eight objects were created
 * variable "perimeter" is declared
 * a collection of figures has been created
 * method is called in this class.
 */
public class Runner {
    public static void main(String[] args) {
        Figure figure1 = new Triangle("First triangle", 4, 2, 3, 5);
        Figure figure2 = new Triangle("Second triangle", 5, 7, 4, 1);
        Figure figure3 = new Triangle("Third triangle", 0, 1, -5, 6);
        Figure figure4 = new Rectangle("First rectangle", 5, 7);
        Figure figure5 = new Rectangle("Second rectangle", 1, 2);
        Figure figure6 = new Rectangle("Third rectangle", 0, -7);
        Figure figure7 = new Circle("First circle", 3);
        Figure figure8 = new Circle("Second circle", -4);

        double perimeter = 0;

        List<Figure> figures = new ArrayList<Figure>();
        figures.add(figure1);
        figures.add(figure2);
        figures.add(figure3);
        figures.add(figure4);
        figures.add(figure5);
        figures.add(figure6);
        figures.add(figure7);
        figures.add(figure8);

        for (Figure f : figures) {
            System.out.println(f.toString());
            f.calculatePerimeter(perimeter);
            System.out.println("__________");
        }
    }
}
