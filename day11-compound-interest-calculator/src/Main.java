import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Variable declarations
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        // User input
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (%): ");
        rate = scanner.nextDouble();

        // Convert percentage to decimal
        rate /= 100;

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        // Compound interest calculation
        amount = principal * Math.pow(
                1 + rate / timesCompounded,
                timesCompounded * years
        );

        // Display result
        System.out.printf(
                "%nAmount after %d year(s): $%.2f%n",
                years,
                amount
        );

        // Close scanner
        scanner.close();
    }
}
