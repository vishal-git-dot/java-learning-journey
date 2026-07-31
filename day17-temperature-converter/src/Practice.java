import java.util.Scanner;

/*
 * Day 17 - Temperature Converter
 *
 * Practice File
 *
 * This file contains additional examples and experiments
 * related to:
 *
 * - Scanner
 * - double
 * - String
 * - toUpperCase()
 * - Method chaining
 * - equals()
 * - Ternary operator
 * - Temperature conversion
 * - printf()
 * - Formatted output
 *
 * Each section demonstrates a small independent example.
 */
public class Practice {

    public static void main(String[] args) {

        // =========================================================
        // Practice 1 - Basic Ternary Operator
        // =========================================================

        int age = 20;

        String ageResult = age >= 18
                ? "Adult"
                : "Minor";

        System.out.println("Practice 1:");
        System.out.println(ageResult);

        // =========================================================
        // Practice 2 - Temperature Classification
        // =========================================================

        double temperature = 35.0;

        String temperatureStatus = temperature >= 30
                ? "Hot"
                : "Not hot";

        System.out.println("\nPractice 2:");
        System.out.println(temperatureStatus);

        // =========================================================
        // Practice 3 - Fahrenheit to Celsius
        // =========================================================

        double fahrenheit = 100;

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("\nPractice 3:");
        System.out.printf("%.1f\u00B0F = %.1f\u00B0C%n", fahrenheit, celsius);

        // =========================================================
        // Practice 4 - Celsius to Fahrenheit
        // =========================================================

        double celsiusValue = 30;

        double fahrenheitValue = celsiusValue * 9 / 5 + 32;

        System.out.println("\nPractice 4:");
        System.out.printf(
                "%.1f\u00B0C = %.1f\u00B0F%n",
                celsiusValue,
                fahrenheitValue
        );

        // =========================================================
        // Practice 5 - String to Uppercase
        // =========================================================

        String lowerCaseUnit = "c";

        String upperCaseUnit = lowerCaseUnit.toUpperCase();

        System.out.println("\nPractice 5:");
        System.out.println("Original: " + lowerCaseUnit);
        System.out.println("Uppercase: " + upperCaseUnit);

        // =========================================================
        // Practice 6 - Method Chaining
        // =========================================================

        String chainedUnit = "f".toUpperCase();

        System.out.println("\nPractice 6:");
        System.out.println("Unit: " + chainedUnit);

        // =========================================================
        // Practice 7 - Scanner Method Chaining
        // =========================================================

        /*
         * This example is commented out so Practice.java
         * remains a single clean runnable program.
         *
         * String unit = scanner.next().toUpperCase();
         */

        System.out.println("\nPractice 7:");
        System.out.println("scanner.next().toUpperCase()");

        // =========================================================
        // Practice 8 - String equals()
        // =========================================================

        String unit = "C";

        boolean isCelsius = unit.equals("C");

        System.out.println("\nPractice 8:");
        System.out.println("Is Celsius? " + isCelsius);

        // =========================================================
        // Practice 9 - String Comparison
        // =========================================================

        String fahrenheitUnit = "F";

        boolean isFahrenheit = fahrenheitUnit.equals("F");

        System.out.println("\nPractice 9:");
        System.out.println("Is Fahrenheit? " + isFahrenheit);

        // =========================================================
        // Practice 10 - Ternary Temperature Conversion
        // =========================================================

        double temp = 75;
        String targetUnit = "C";

        double convertedTemperature = targetUnit.equals("C")
                ? (temp - 32) * 5 / 9
                : temp * 9 / 5 + 32;

        System.out.println("\nPractice 10:");
        System.out.printf(
                "Converted temperature: %.1f\u00B0%s%n",
                convertedTemperature,
                targetUnit
        );

        // =========================================================
        // Practice 11 - Fahrenheit Conversion With Ternary
        // =========================================================

        temp = 30;
        targetUnit = "F";

        convertedTemperature = targetUnit.equals("C")
                ? (temp - 32) * 5 / 9
                : temp * 9 / 5 + 32;

        System.out.println("\nPractice 11:");
        System.out.printf(
                "Converted temperature: %.1f\u00B0%s%n",
                convertedTemperature,
                targetUnit
        );

        // =========================================================
        // Practice 12 - Freezing Point
        // =========================================================

        double freezingTemperature = 0;

        String freezingStatus = freezingTemperature <= 0
                ? "Freezing"
                : "Above freezing";

        System.out.println("\nPractice 12:");
        System.out.println(freezingStatus);

        // =========================================================
        // Practice 13 - Hot or Cold
        // =========================================================

        double weatherTemperature = 28;

        String weatherStatus = weatherTemperature >= 30
                ? "Hot"
                : "Not hot";

        System.out.println("\nPractice 13:");
        System.out.println(weatherStatus);

        // =========================================================
        // Practice 14 - Positive or Negative
        // =========================================================

        int number = -15;

        String numberStatus = number >= 0
                ? "Positive"
                : "Negative";

        System.out.println("\nPractice 14:");
        System.out.println(numberStatus);

        // =========================================================
        // Practice 15 - Even or Odd
        // =========================================================

        int value = 24;

        String evenOdd = value % 2 == 0
                ? "Even"
                : "Odd";

        System.out.println("\nPractice 15:");
        System.out.println(evenOdd);

        // =========================================================
        // Practice 16 - Maximum Number
        // =========================================================

        int firstNumber = 50;
        int secondNumber = 75;

        int maximum = firstNumber > secondNumber
                ? firstNumber
                : secondNumber;

        System.out.println("\nPractice 16:");
        System.out.println("Maximum: " + maximum);

        // =========================================================
        // Practice 17 - Minimum Number
        // =========================================================

        int minimum = firstNumber < secondNumber
                ? firstNumber
                : secondNumber;

        System.out.println("\nPractice 17:");
        System.out.println("Minimum: " + minimum);

        // =========================================================
        // Practice 18 - printf() With One Decimal
        // =========================================================

        double decimalValue = 37.777777;

        System.out.println("\nPractice 18:");
        System.out.printf("%.1f%n", decimalValue);

        // =========================================================
        // Practice 19 - printf() With Two Decimals
        // =========================================================

        System.out.println("\nPractice 19:");
        System.out.printf("%.2f%n", decimalValue);

        // =========================================================
        // Practice 20 - printf() With Three Decimals
        // =========================================================

        System.out.println("\nPractice 20:");
        System.out.printf("%.3f%n", decimalValue);

        // =========================================================
        // Practice 21 - Multiple printf() Values
        // =========================================================

        double originalTemperature = 100;
        double converted = (originalTemperature - 32) * 5 / 9;

        System.out.println("\nPractice 21:");

        System.out.printf(
                "%.1f\u00B0F = %.1f\u00B0C%n",
                originalTemperature,
                converted
        );

        // =========================================================
        // Practice 22 - Celsius to Fahrenheit
        // =========================================================

        originalTemperature = 25;

        converted = originalTemperature * 9 / 5 + 32;

        System.out.println("\nPractice 22:");

        System.out.printf(
                "%.1f\u00B0C = %.1f\u00B0F%n",
                originalTemperature,
                converted
        );

        // =========================================================
        // Practice 23 - Temperature Conversion Method
        // =========================================================

        double convertedCelsius = fahrenheitToCelsius(212);

        System.out.println("\nPractice 23:");

        System.out.printf(
                "212.0\u00B0F = %.1f\u00B0C%n",
                convertedCelsius
        );

        // =========================================================
        // Practice 24 - Reverse Conversion Method
        // =========================================================

        double convertedFahrenheit = celsiusToFahrenheit(100);

        System.out.println("\nPractice 24:");

        System.out.printf(
                "100.0\u00B0C = %.1f\u00B0F%n",
                convertedFahrenheit
        );

        // =========================================================
        // Practice 25 - Ternary With Conversion Methods
        // =========================================================

        double inputTemperature = 50;
        String conversionUnit = "C";

        double result = conversionUnit.equals("C")
                ? fahrenheitToCelsius(inputTemperature)
                : celsiusToFahrenheit(inputTemperature);

        System.out.println("\nPractice 25:");

        System.out.printf(
                "Result: %.1f\u00B0%s%n",
                result,
                conversionUnit
        );

        // =========================================================
        // Practice 26 - Important Reference Points
        // =========================================================

        System.out.println("\nPractice 26:");

        double freezingPoint = fahrenheitToCelsius(32);
        double boilingPoint = fahrenheitToCelsius(212);

        System.out.printf(
                "32.0\u00B0F = %.1f\u00B0C%n",
                freezingPoint
        );

        System.out.printf(
                "212.0\u00B0F = %.1f\u00B0C%n",
                boilingPoint
        );

        // =========================================================
        // Practice 27 - Negative Temperature
        // =========================================================

        double negativeFahrenheit = -40;

        double negativeCelsius = fahrenheitToCelsius(negativeFahrenheit);

        System.out.println("\nPractice 27:");

        System.out.printf(
                "-40.0\u00B0F = %.1f\u00B0C%n",
                negativeCelsius
        );

        // =========================================================
        // Practice 28 - Celsius Reference Table
        // =========================================================

        System.out.println("\nPractice 28:");
        System.out.println("Celsius    Fahrenheit");
        System.out.println("---------------------");

        for (int celsiusTemperature = 0;
             celsiusTemperature <= 50;
             celsiusTemperature += 10) {

            double fahrenheitTemperature =
                    celsiusToFahrenheit(celsiusTemperature);

            System.out.printf(
                    "%7d\u00B0C    %7.1f\u00B0F%n",
                    celsiusTemperature,
                    fahrenheitTemperature
            );
        }

        // =========================================================
        // Practice 29 - Fahrenheit Reference Table
        // =========================================================

        System.out.println("\nPractice 29:");
        System.out.println("Fahrenheit    Celsius");
        System.out.println("--------------------");

        for (int fahrenheitTemperature = 32;
             fahrenheitTemperature <= 212;
             fahrenheitTemperature += 30) {

            double celsiusTemperature =
                    fahrenheitToCelsius(fahrenheitTemperature);

            System.out.printf(
                    "%9d\u00B0F    %7.1f\u00B0C%n",
                    fahrenheitTemperature,
                    celsiusTemperature
            );
        }

        // =========================================================
        // Practice 30 - Scanner Example
        // =========================================================

        /*
         * The following example demonstrates the complete
         * Scanner input pattern used in Main.java.
         *
         * Scanner scanner = new Scanner(System.in);
         *
         * System.out.print("Enter temperature: ");
         * double userTemperature = scanner.nextDouble();
         *
         * System.out.print("Enter target unit (C/F): ");
         * String userUnit = scanner.next().toUpperCase();
         *
         * double userResult = userUnit.equals("C")
         *         ? fahrenheitToCelsius(userTemperature)
         *         : celsiusToFahrenheit(userTemperature);
         *
         * System.out.printf(
         *         "Result: %.1f\u00B0%s%n",
         *         userResult,
         *         userUnit
         * );
         *
         * scanner.close();
         */

        System.out.println("\nPractice 30:");
        System.out.println("Complete Scanner example is available in Main.java.");

        // =========================================================
        // Practice Complete
        // =========================================================

        System.out.println("\n=================================");
        System.out.println("Temperature practice complete!");
        System.out.println("=================================");
    }

    // =============================================================
    // Fahrenheit to Celsius
    // =============================================================

    /*
     * Converts a Fahrenheit temperature to Celsius.
     *
     * Formula:
     *
     * C = (F - 32) * 5 / 9
     */
    public static double fahrenheitToCelsius(double fahrenheit) {

        return (fahrenheit - 32) * 5 / 9;
    }

    // =============================================================
    // Celsius to Fahrenheit
    // =============================================================

    /*
     * Converts a Celsius temperature to Fahrenheit.
     *
     * Formula:
     *
     * F = C * 9 / 5 + 32
     */
    public static double celsiusToFahrenheit(double celsius) {

        return celsius * 9 / 5 + 32;
    }
}
