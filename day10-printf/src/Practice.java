public class Practice {

    public static void main(String[] args) {

        // =====================================
        // Practice 1 - String
        // =====================================

        String language = "Java";
        System.out.printf("Language: %s%n", language);

        // =====================================
        // Practice 2 - Character
        // =====================================

        char grade = 'A';
        System.out.printf("Grade: %c%n", grade);

        // =====================================
        // Practice 3 - Integer
        // =====================================

        int score = 95;
        System.out.printf("Score: %d%n", score);

        // =====================================
        // Practice 4 - Double
        // =====================================

        double temperature = 36.6789;
        System.out.printf("Temperature: %.2f°C%n", temperature);

        // =====================================
        // Practice 5 - Boolean
        // =====================================

        boolean passed = true;
        System.out.printf("Passed: %b%n", passed);

        // =====================================
        // Practice 6 - Width
        // =====================================

        System.out.println("\nRight Justified:");

        System.out.printf("%6d%n", 5);
        System.out.printf("%6d%n", 50);
        System.out.printf("%6d%n", 500);

        // =====================================
        // Practice 7 - Left Justified
        // =====================================

        System.out.println("\nLeft Justified:");

        System.out.printf("%-6dEND%n", 5);
        System.out.printf("%-6dEND%n", 50);
        System.out.printf("%-6dEND%n", 500);

        // =====================================
        // Practice 8 - Zero Padding
        // =====================================

        System.out.println("\nZero Padding:");

        System.out.printf("%04d%n", 7);
        System.out.printf("%04d%n", 78);
        System.out.printf("%04d%n", 789);

        // =====================================
        // Practice 9 - Comma Separator
        // =====================================

        System.out.printf("%,.2f%n", 1250000.75);

        // =====================================
        // Practice 10 - Mini Report
        // =====================================

        System.out.println("\nStudent Report");

        String student = "Alice";
        int roll = 101;
        double marks = 92.75;
        boolean result = true;

        System.out.printf("Name   : %s%n", student);
        System.out.printf("Roll   : %04d%n", roll);
        System.out.printf("Marks  : %.2f%n", marks);
        System.out.printf("Passed : %b%n", result);
    }
}
