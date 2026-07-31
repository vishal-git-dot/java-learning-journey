import java.util.Scanner;

/*
 * Day 17 - Temperature Converter
 *
 * This program converts temperatures between
 * Fahrenheit and Celsius.
 *
 * The target unit is entered by the user:
 *
 * C -> Fahrenheit to Celsius
 * F -> Celsius to Fahrenheit
 *
 * The project demonstrates:
 * - Scanner
 * - User input
 * - double
 * - String
 * - Method chaining
 * - toUpperCase()
 * - equals()
 * - Ternary operator
 * - printf()
 * - Formatted output
 */
public class Main {

    public static void main(String[] args) {

        // =========================================================
        // Create Scanner
        // =========================================================

        Scanner scanner = new Scanner(System.in);

        // =========================================================
        // Get Original Temperature
        // =========================================================

        System.out.print("Enter the temperature: ");
        double temp = scanner.nextDouble();

        // =========================================================
        // Get Target Unit
        // =========================================================

        System.out.print("Convert to Celsius or Fahrenheit? (C/F): ");

        /*
         * next() reads the user's input.
         *
         * toUpperCase() converts lowercase input
         * such as "c" into uppercase "C".
         */
        String unit = scanner.next().toUpperCase();

        // =========================================================
        // Convert Temperature
        // =========================================================

        /*
         * Ternary operator:
         *
         * If the target unit is Celsius:
         *     Fahrenheit -> Celsius
         *
         * Otherwise:
         *     Celsius -> Fahrenheit
         */
        double newTemp = unit.equals("C")
                ? (temp - 32) * 5 / 9
                : temp * 9 / 5 + 32;

        // =========================================================
        // Display Result
        // =========================================================

        /*
         * %.1f -> display one decimal place
         * \u00B0 -> degree symbol
         * %s   -> display String
         * %n   -> new line
         */
        System.out.printf(
                "The temperature is: %.1f\u00B0%s%n",
                newTemp,
                unit
        );

        // =========================================================
        // Close Scanner
        // =========================================================

        scanner.close();
    }
}

