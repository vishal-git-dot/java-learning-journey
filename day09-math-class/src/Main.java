import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ============================================
        // Display Math Constants
        // ============================================

        System.out.println("Math.PI = " + Math.PI);
        System.out.println("Math.E  = " + Math.E);

        // ============================================
        // Math Methods
        // ============================================

        System.out.println("\n2^5 = " + Math.pow(2, 5));
        System.out.println("Absolute Value of -25 = " + Math.abs(-25));
        System.out.println("Square Root of 81 = " + Math.sqrt(81));

        System.out.println("Round 3.75 = " + Math.round(3.75));
        System.out.println("Ceil 3.14 = " + Math.ceil(3.14));
        System.out.println("Floor 3.99 = " + Math.floor(3.99));

        System.out.println("Maximum = " + Math.max(10, 20));
        System.out.println("Minimum = " + Math.min(10, 20));

        // ============================================
        // Hypotenuse Calculator
        // ============================================

        System.out.print("\nEnter Side A: ");
        double a = scanner.nextDouble();

        System.out.print("Enter Side B: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("Hypotenuse = " + c);

        scanner.close();
    }
}
