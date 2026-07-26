/*
 * ==========================================================
 * Day 15 - Practice Exercises 🏋️
 * Chapter 15: Weight Converter
 *
 * This file contains small independent practice programs.
 * Uncomment ONE exercise at a time to run it.
 * ==========================================================
 */

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
         * ======================================================
         * Exercise 1
         * Print a Weight Converter Menu
         * ======================================================
         */

//        System.out.println("===== Weight Converter =====");
//        System.out.println("1. Pounds to Kilograms");
//        System.out.println("2. Kilograms to Pounds");



        /*
         * ======================================================
         * Exercise 2
         * Read User Choice
         * ======================================================
         */

//        System.out.print("Choose an option: ");
//        int choice = scanner.nextInt();
//
//        System.out.println("You selected option " + choice);



        /*
         * ======================================================
         * Exercise 3
         * Read Weight
         * ======================================================
         */

//        System.out.print("Enter weight: ");
//        double weight = scanner.nextDouble();
//
//        System.out.println("Weight entered: " + weight);



        /*
         * ======================================================
         * Exercise 4
         * Pounds -> Kilograms
         * Formula:
//         * kg = lbs × 0.453592
         * ======================================================
         */

//        System.out.print("Enter weight in lbs: ");
//        double lbs = scanner.nextDouble();
//
//        double kg = lbs * 0.453592;
//
//        System.out.printf("%.2f lbs = %.2f kg%n", lbs, kg);



        /*
         * ======================================================
         * Exercise 5
         * Kilograms -> Pounds
         * Formula:
//         * lbs = kg × 2.20462
         * ======================================================
         */

//        System.out.print("Enter weight in kg: ");
//        double kg = scanner.nextDouble();
//
//        double lbs = kg * 2.20462;
//
//        System.out.printf("%.2f kg = %.2f lbs%n", kg, lbs);



        /*
         * ======================================================
         * Exercise 6
         * Simple if Statement
         * ======================================================
         */

//        int choice = 1;
//
//        if(choice == 1){
//            System.out.println("Convert Pounds to Kilograms");
//        }



        /*
         * ======================================================
         * Exercise 7
         * if - else
         * ======================================================
         */

//        int choice = 2;
//
//        if(choice == 1){
//            System.out.println("Pounds -> Kilograms");
//        }
//        else{
//            System.out.println("Kilograms -> Pounds");
//        }



        /*
         * ======================================================
         * Exercise 8
         * if - else if - else
         * ======================================================
         */

//        int choice = 3;
//
//        if(choice == 1){
//            System.out.println("Pounds -> Kilograms");
//        }
//        else if(choice == 2){
//            System.out.println("Kilograms -> Pounds");
//        }
//        else{
//            System.out.println("Invalid choice.");
//        }



        /*
         * ======================================================
         * Exercise 9
         * printf Formatting
         * ======================================================
         */

//        double value = 68.038799;
//
//        System.out.printf("%.2f%n", value);



        /*
         * ======================================================
         * Exercise 10
         * Display Conversion Table
         * ======================================================
         */

//        double[] pounds = {50, 75, 100, 150, 200};
//
//        for(double value : pounds){
//
//            double kg = value * 0.453592;
//
//            System.out.printf("%.2f lbs = %.2f kg%n",
//                    value,
//                    kg);
//        }



        /*
         * ======================================================
         * Exercise 11
         * Negative Weight Check
         * ======================================================
         */

//        System.out.print("Enter weight: ");
//        double weight = scanner.nextDouble();
//
//        if(weight < 0){
//            System.out.println("Weight cannot be negative.");
//        }
//        else{
//            System.out.println("Weight accepted.");
//        }



        /*
         * ======================================================
         * Exercise 12
         * Build a Menu
         * ======================================================
         */

//        System.out.println("1. Pounds -> Kilograms");
//        System.out.println("2. Kilograms -> Pounds");
//        System.out.println("3. Exit");



        /*
         * ======================================================
         * Exercise 13
         * Exit Option
         * ======================================================
         */

//        int choice = 3;
//
//        if(choice == 3){
//            System.out.println("Goodbye!");
//        }



        /*
         * ======================================================
         * Exercise 14
         * Complete Converter
         * ======================================================
         */

//        System.out.println("Weight Converter");
//        System.out.println("1. Pounds -> Kilograms");
//        System.out.println("2. Kilograms -> Pounds");
//
//        System.out.print("Choose: ");
//        int choice = scanner.nextInt();
//
//        if(choice == 1){
//
//            System.out.print("Enter lbs: ");
//            double lbs = scanner.nextDouble();
//
//            double kg = lbs * 0.453592;
//
//            System.out.printf("%.2f lbs = %.2f kg%n",
//                    lbs,
//                    kg);
//
//        }
//        else if(choice == 2){
//
//            System.out.print("Enter kg: ");
//            double kg = scanner.nextDouble();
//
//            double lbs = kg * 2.20462;
//
//            System.out.printf("%.2f kg = %.2f lbs%n",
//                    kg,
//                    lbs);
//        }
//        else{
//            System.out.println("Invalid choice.");
//        }



        /*
         * ======================================================
         * Exercise 15 (Challenge)
         * Multiple Conversions
         * ======================================================
         */

//        char again;
//
//        do{
//
//            System.out.println();
//            System.out.println("1. Pounds -> Kilograms");
//            System.out.println("2. Kilograms -> Pounds");
//
//            System.out.print("Choose: ");
//            int choice = scanner.nextInt();
//
//            if(choice == 1){
//
//                System.out.print("Enter lbs: ");
//                double lbs = scanner.nextDouble();
//
//                System.out.printf("%.2f lbs = %.2f kg%n",
//                        lbs,
//                        lbs * 0.453592);
//
//            }
//            else if(choice == 2){
//
//                System.out.print("Enter kg: ");
//                double kg = scanner.nextDouble();
//
//                System.out.printf("%.2f kg = %.2f lbs%n",
//                        kg,
//                        kg * 2.20462);
//            }
//            else{
//                System.out.println("Invalid choice.");
//            }
//
//            System.out.print("Perform another conversion? (y/n): ");
//            again = scanner.next().charAt(0);
//
//        }while(again == 'y' || again == 'Y');



        // Close Scanner
        scanner.close();

    }
}
