public class Main {

    public static void main(String[] args) {

        // Customer information
        boolean isStudent = true;
        boolean isSenior = false;

        // Original ticket price
        double price = 9.99;

        // Apply discounts
        if (isStudent) {

            if (isSenior) {
                System.out.println("You receive a student discount (10%).");
                System.out.println("You also receive a senior discount (20%).");
                price *= 0.70;
            } else {
                System.out.println("You receive a student discount (10%).");
                price *= 0.90;
            }

        } else {

            if (isSenior) {
                System.out.println("You receive a senior discount (20%).");
                price *= 0.80;
            } else {
                System.out.println("No discounts available.");
            }
        }

        // Display final ticket price
        System.out.printf("Final Ticket Price: $%.2f%n", price);
    }
}
