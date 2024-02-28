package com.teachmeskills.hw15.task3.calculation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class with static method to implementing the logic for creating a collection with random integer values
 * the collection size is entered from the console
 * to calculating the arithmetic mean of all elements of the collection and displaying the result on the screen.
 */
public class Calculation {
    private Calculation() {

    }

    public static void logicImplementations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter collection size: ");
        if (scanner.hasNextInt()) {
            int collectionDimension = scanner.nextInt();
            if (collectionDimension <= 0) {
                System.out.println("re-Enter. Collection size cannot be 0 or a negative value");
            } else {
                List<Integer> numbers = new ArrayList<Integer>(collectionDimension);
                for (int i = 0; i < collectionDimension; i++) {
                    int randomNumber = (int) (Math.random() * 10);
                    numbers.add(randomNumber);
                }
                int result = 0;
                for (Integer i : numbers) {
                    result += i;
                }
                System.out.println("The arithmetic mean is equal to: " + result / collectionDimension);
            }
        } else {
            System.out.println("re-Enter. An incorrect collection size has been introduced");
        }
    }
}
