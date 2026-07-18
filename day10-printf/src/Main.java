public class Main {

    public static void main(String[] args) {

        // =====================================
        // Variables
        // =====================================

        String name = "SpongeBob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        // =====================================
        // Basic Specifiers
        // =====================================

        System.out.printf("Name: %s%n", name);
        System.out.printf("First Letter: %c%n", firstLetter);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Height: %f%n", height);
        System.out.printf("Employed: %b%n", isEmployed);

        System.out.println();

        // =====================================
        // Multiple Variables
        // =====================================

        System.out.printf("%s is %d years old.%n", name, age);

        System.out.println();

        // =====================================
        // Precision
        // =====================================

        double price = 19.9999;

        System.out.printf("Default: %f%n", price);
        System.out.printf("One Decimal: %.1f%n", price);
        System.out.printf("Two Decimals: %.2f%n", price);
        System.out.printf("Three Decimals: %.3f%n", price);

        System.out.println();

        // =====================================
        // Flags
        // =====================================

        System.out.printf("Plus Flag: %+,.2f%n", 12345.678);
        System.out.printf("Comma Flag: %,.2f%n", 1234567.89);

        System.out.println();

        // =====================================
        // Width
        // =====================================

        System.out.printf("%4d%n", 1);
        System.out.printf("%4d%n", 23);
        System.out.printf("%4d%n", 456);
        System.out.printf("%4d%n", 7890);

        System.out.println();

        // =====================================
        // Zero Padding
        // =====================================

        System.out.printf("%04d%n", 1);
        System.out.printf("%04d%n", 23);
        System.out.printf("%04d%n", 456);
        System.out.printf("%04d%n", 7890);

        System.out.println();

        // =====================================
        // Left Justification
        // =====================================

        System.out.printf("%-10sProgramming%n", "Java");
    }
}
