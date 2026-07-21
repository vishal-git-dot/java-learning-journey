public class Practice {

    public static void main(String[] args) {

        /*
         * ==========================================
         * Practice Example 1
         * Simple Nested if
         * ==========================================
         */

        boolean hasTicket = true;
        boolean hasID = true;

        if (hasTicket) {

            if (hasID) {
                System.out.println("Entry Allowed");
            } else {
                System.out.println("Show your ID.");
            }

        } else {
            System.out.println("Please buy a ticket.");
        }

        /*
         * ==========================================
         * Practice Example 2
         * Student Discount
         * ==========================================
         */

        boolean isStudent = true;
        boolean isSenior = false;

        double ticketPrice = 12.99;

        if (isStudent) {

            if (isSenior) {
                ticketPrice *= 0.70;
            } else {
                ticketPrice *= 0.90;
            }

        } else {

            if (isSenior) {
                ticketPrice *= 0.80;
            }
        }

        System.out.printf(
                "%nDiscounted Price: $%.2f%n",
                ticketPrice
        );

        /*
         * ==========================================
         * Practice Example 3
         * Login Example
         * ==========================================
         */

        boolean usernameCorrect = true;
        boolean passwordCorrect = true;

        if (usernameCorrect) {

            if (passwordCorrect) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Incorrect Password");
            }

        } else {
            System.out.println("Username Not Found");
        }

        /*
         * ==========================================
         * Practice Example 4
         * Driving Eligibility
         * ==========================================
         */

        boolean passedTest = true;
        boolean ageRequirement = true;

        if (passedTest) {

            if (ageRequirement) {
                System.out.println("Driver's License Approved");
            } else {
                System.out.println("Age Requirement Not Met");
            }

        } else {
            System.out.println("Driving Test Failed");
        }

        /*
         * ==========================================
         * Practice Example 5
         * Membership Check
         * ==========================================
         */

        boolean isMember = true;
        boolean premium = true;

        if (isMember) {

            if (premium) {
                System.out.println("Premium Benefits Activated");
            } else {
                System.out.println("Standard Membership");
            }

        } else {
            System.out.println("Guest User");
        }

        /*
         * ==========================================
         * Practice Example 6
         * Nested if with Numbers
         * ==========================================
         */

        int age = 70;

        if (age >= 18) {

            if (age >= 65) {
                System.out.println("Senior Citizen");
            } else {
                System.out.println("Adult");
            }

        } else {
            System.out.println("Minor");
        }

        /*
         * ==========================================
         * Practice Example 7
         * Price Calculation
         * ==========================================
         */

        double originalPrice = 50.00;
        double finalPrice = originalPrice;

        boolean coupon = true;
        boolean holidaySale = true;

        if (coupon) {

            if (holidaySale) {
                finalPrice *= 0.60;
            } else {
                finalPrice *= 0.80;
            }

        } else {

            if (holidaySale) {
                finalPrice *= 0.90;
            }
        }

        System.out.printf(
                "Final Price: $%.2f%n",
                finalPrice
        );
    }
}
