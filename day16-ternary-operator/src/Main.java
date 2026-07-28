public class Main {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // Example 1 - Pass or Fail
        // ----------------------------------------------------

        int score = 70;

        String result = (score >= 60) ? "Pass" : "Fail";

        System.out.println("Score: " + score);
        System.out.println("Result: " + result);

        System.out.println();

        // ----------------------------------------------------
        // Example 2 - Even or Odd
        // ----------------------------------------------------

        int number = 7;

        String type = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("Number: " + number);
        System.out.println("Type: " + type);

        System.out.println();

        // ----------------------------------------------------
        // Example 3 - AM or PM
        // ----------------------------------------------------

        int hour = 13;

        String period = (hour < 12) ? "AM" : "PM";

        System.out.println("Hour: " + hour);
        System.out.println("Time Period: " + period);

        System.out.println();

        // ----------------------------------------------------
        // Example 4 - Tax Rate
        // ----------------------------------------------------

        double income = 60000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println("Income: $" + income);
        System.out.println("Tax Rate: " + (taxRate * 100) + "%");
    }
}
