import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Example 1 - Positive / Negative / Zero
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Positive Number");
        } else if (number < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }

        // Example 2 - Even / Odd
        System.out.print("\nEnter another number: ");
        int value = scanner.nextInt();

        if (value % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        // Example 3 - Voting Eligibility
        System.out.print("\nEnter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }

        // Example 4 - Temperature Checker
        System.out.print("\nEnter temperature: ");
        double temperature = scanner.nextDouble();

        if (temperature >= 35) {
            System.out.println("Hot Weather");
        } else if (temperature >= 20) {
            System.out.println("Pleasant Weather");
        } else {
            System.out.println("Cold Weather");
        }

        scanner.close();

    }
}
