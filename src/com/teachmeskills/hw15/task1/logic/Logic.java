package com.teachmeskills.hw15.task1.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class with static method to implementing the logic for creating a collection consisting of integers
 * to casting the "String" type to the "Integer" type and adding the integers entered from the console to the collection
 * to display even numbers on the screen.
 */
public class Logic {
    private Logic() {

    }

    public static void logicImplementations() {
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        boolean checkbox = true;

        while (checkbox) {
            String str = scanner.nextLine();
            try {
                int val = Integer.parseInt(str);
                numbers.add(val);
            } catch (NumberFormatException e) {
                if (str.equals("exit")) {
                    checkbox = false;
                } else {
                    System.out.println("Invalid String");
                }
            } catch (Exception e) {
                System.out.println("Completely different error");
            }
        }
        scanner.close();

        System.out.println("Even numbers from our collection:");
        for (Integer i : numbers) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
