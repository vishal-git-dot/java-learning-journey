import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // =====================================================
        // Example 1 - Math Constants
        // =====================================================

        System.out.println("PI = " + Math.PI);
        System.out.println("Euler's Number = " + Math.E);

        // =====================================================
        // Example 2 - Power
        // =====================================================

        System.out.println("\nPower Examples");
        System.out.println("2^3 = " + Math.pow(2, 3));
        System.out.println("5^2 = " + Math.pow(5, 2));
        System.out.println("10^4 = " + Math.pow(10, 4));

        // =====================================================
        // Example 3 - Square Root
        // =====================================================

        System.out.println("\nSquare Roots");
        System.out.println(Math.sqrt(16));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.sqrt(100));

        // =====================================================
        // Example 4 - Absolute Value
        // =====================================================

        System.out.println("\nAbsolute Values");
        System.out.println(Math.abs(-15));
        System.out.println(Math.abs(25));
        System.out.println(Math.abs(-87.5));

        // =====================================================
        // Example 5 - Rounding
        // =====================================================

        double number = 3.75;

        System.out.println("\nOriginal : " + number);
        System.out.println("Round    : " + Math.round(number));
        System.out.println("Ceiling  : " + Math.ceil(number));
        System.out.println("Floor    : " + Math.floor(number));

        // =====================================================
        // Example 6 - Max and Min
        // =====================================================

        System.out.println("\nMaximum = " + Math.max(75, 93));
        System.out.println("Minimum = " + Math.min(75, 93));

        // =====================================================
        // Example 7 - Circle Calculator
        // =====================================================

        System.out.print("\nEnter Radius: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("\nCircle & Sphere Measurements");
        System.out.println("----------------------------");
        System.out.println("Circumference : " + circumference);
        System.out.println("Area          : " + area);
        System.out.println("Volume        : " + volume);

        // =====================================================
        // Practice Challenge
        // =====================================================

        System.out.println("\nPractice Challenge");
        System.out.println("------------------");
        System.out.println("1. Create a BMI Calculator.");
        System.out.println("2. Create a Distance Calculator.");
        System.out.println("3. Create a Simple Scientific Calculator.");
        System.out.println("4. Format results using printf().");
        System.out.println("5. Build a Geometry Calculator supporting multiple shapes.");

        scanner.close();
    }
}
