/*
 * Day 02 - Practice
 *
 * Practice examples for Java variables.
 */

public class Practice {

    public static void main(String[] args) {

        // =====================================
        // Integer
        // =====================================

        int age = 21;
        int year = 2025;
        int quantity = 5;

        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Quantity: " + quantity);

        System.out.println();

        // =====================================
        // Double
        // =====================================

        double price = 19999.99;
        double gpa = 3.8;
        double temperature = 27.5;

        System.out.println("Price: $" + price);
        System.out.println("GPA: " + gpa);
        System.out.println("Temperature: " + temperature);

        System.out.println();

        // =====================================
        // Character
        // =====================================

        char grade = 'A';
        char currency = '$';
        char symbol = '!';

        System.out.println("Grade: " + grade);
        System.out.println("Currency: " + currency);
        System.out.println("Symbol: " + symbol);

        System.out.println();

        // =====================================
        // Boolean
        // =====================================

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println("Student: " + isStudent);
        System.out.println("For Sale: " + forSale);
        System.out.println("Online: " + isOnline);

        System.out.println();

        // =====================================
        // Strings
        // =====================================

        String name = "John Doe";
        String food = "Pizza";
        String email = "john@example.com";
        String color = "Red";
        String car = "Mustang";

        System.out.println("Name: " + name);
        System.out.println("Favorite Food: " + food);
        System.out.println("Email: " + email);

        System.out.println();

        // =====================================
        // String Concatenation
        // =====================================

        System.out.println("Hello " + name);

        System.out.println("Your favorite food is " + food);

        System.out.println("Your email is " + email);

        System.out.println("Your choice is a " + color + " " + year + " " + car);

        System.out.println("Price: " + currency + price);

        System.out.println();

        // =====================================
        // Boolean Example
        // =====================================

        if (forSale) {
            System.out.println("The " + car + " is for sale.");
        } else {
            System.out.println("The " + car + " is not for sale.");
        }

        System.out.println();

        // =====================================
        // Student Profile
        // =====================================

        System.out.println("===== Student Profile =====");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("GPA        : " + gpa);
        System.out.println("Grade      : " + grade);
        System.out.println("Student    : " + isStudent);
        System.out.println("Dream Car  : " + color + " " + year + " " + car);
        System.out.println("===========================");

    }

}
