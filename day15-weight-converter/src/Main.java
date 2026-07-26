/*
 * ==========================================================
 * Day 15 - Weight Converter 🏋️
 * Chapter 15: Weight Converter
 *
 * Mini Project #4
 *
 * Concepts Covered:
 * - Scanner
 * - User Input
 * - Variables
 * - if / else if / else
 * - Arithmetic Operations
 * - printf Formatting
 * - Resource Management
 * ==========================================================
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create Scanner
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        double weight;
        double newWeight;
        int choice;

        // Welcome message
        System.out.println("=======================================");
        System.out.println("      WEIGHT CONVERSION PROGRAM");
        System.out.println("=======================================");
        System.out.println();
        System.out.println("1. Convert Pounds (lbs) to Kilograms (kg)");
        System.out.println("2. Convert Kilograms (kg) to Pounds (lbs)");
        System.out.println();

        // User choice
        System.out.print("Choose an option (1 or 2): ");
        choice = scanner.nextInt();

        System.out.println();

        // Pounds -> Kilograms
        if (choice == 1) {

            System.out.print("Enter weight in pounds (lbs): ");
            weight = scanner.nextDouble();

            newWeight = weight * 0.453592;

            System.out.printf(
                    "%.2f lbs = %.2f kg%n",
                    weight,
                    newWeight
            );
        }

        // Kilograms -> Pounds
        else if (choice == 2) {

            System.out.print("Enter weight in kilograms (kg): ");
            weight = scanner.nextDouble();

            newWeight = weight * 2.20462;

            System.out.printf(
                    "%.2f kg = %.2f lbs%n",
                    weight,
                    newWeight
            );
        }

        // Invalid choice
        else {

            System.out.println("That was not a valid choice.");

        }

        // Close Scanner
        scanner.close();

    }
}
