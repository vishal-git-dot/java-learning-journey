import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        /*
         * ===========================================
         * Practice Example 1
         * Percentage to Decimal
         * ===========================================
         */

        double rate = 7.5;

        System.out.println("Original Rate : " + rate + "%");

        rate /= 100;

        System.out.println("Decimal Rate  : " + rate);

        /*
         * ===========================================
         * Practice Example 2
         * Math.pow()
         * ===========================================
         */

        System.out.println("\n2^5 = " + Math.pow(2, 5));
        System.out.println("3^4 = " + Math.pow(3, 4));
        System.out.println("10^2 = " + Math.pow(10, 2));

        /*
         * ===========================================
         * Practice Example 3
         * Display PI
         * ===========================================
         */

        System.out.println("\nPI = " + Math.PI);

        /*
         * ===========================================
         * Practice Example 4
         * Currency Formatting
         * ===========================================
         */

        double balance = 12345.6789;

        System.out.printf("%nBalance : $%.2f%n", balance);

        /*
         * ===========================================
         * Practice Example 5
         * Simple Compound Interest Example
         * ===========================================
         */

        double principal = 10000;
        double interestRate = 0.05;
        int compounds = 4;
        int years = 5;

        double amount = principal * Math.pow(
                1 + interestRate / compounds,
                compounds * years
        );

        System.out.printf(
                "Future Value : $%.2f%n",
                amount
        );

        /*
         * ===========================================
         * Practice Example 6
         * Interactive Version
         * ===========================================
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter Principal: ");
        double p = scanner.nextDouble();

        System.out.print("Enter Interest Rate (%): ");
        double r = scanner.nextDouble();

        r /= 100;

        System.out.print("Enter Times Compounded Per Year: ");
        int n = scanner.nextInt();

        System.out.print("Enter Years: ");
        int t = scanner.nextInt();

        double futureAmount = p * Math.pow(
                1 + r / n,
                n * t
        );

        System.out.printf(
                "%nFuture Investment Value = $%.2f%n",
                futureAmount
        );

        /*
         * ===========================================
         * Practice Example 7
         * Interest Earned
         * ===========================================
         */

        double interestEarned = futureAmount - p;

        System.out.printf(
                "Interest Earned = $%.2f%n",
                interestEarned
        );

        scanner.close();
    }
}
