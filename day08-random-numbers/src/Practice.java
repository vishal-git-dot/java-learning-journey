import java.util.Random;

public class Practice {

    public static void main(String[] args) {

        Random random = new Random();

        // =====================================================
        // Example 1 - Any Integer
        // =====================================================
        System.out.println("Random Integer:");
        System.out.println(random.nextInt());

        // =====================================================
        // Example 2 - Dice Roll
        // =====================================================
        int dice = random.nextInt(1, 7);

        System.out.println("\nDice Roll:");
        System.out.println(dice);

        // =====================================================
        // Example 3 - Three Dice
        // =====================================================
        System.out.println("\nThree Dice:");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Dice " + i + ": " + random.nextInt(1, 7));
        }

        // =====================================================
        // Example 4 - Five Numbers (1-20)
        // =====================================================
        System.out.println("\nFive Random Numbers:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(random.nextInt(1, 21));
        }

        // =====================================================
        // Example 5 - Random Double
        // =====================================================
        System.out.println("\nRandom Double:");
        System.out.println(random.nextDouble());

        // =====================================================
        // Example 6 - Random Double (0-10)
        // =====================================================
        double decimal = random.nextDouble() * 10;

        System.out.println("\nRandom Decimal (0-10):");
        System.out.println(decimal);

        // =====================================================
        // Example 7 - Random Double (50-100)
        // =====================================================
        double score = 50 + random.nextDouble() * 50;

        System.out.println("\nRandom Decimal (50-100):");
        System.out.println(score);

        // =====================================================
        // Example 8 - Random Boolean
        // =====================================================
        boolean coin = random.nextBoolean();

        System.out.println("\nBoolean Value:");
        System.out.println(coin);

        // =====================================================
        // Example 9 - Coin Flip
        // =====================================================
        System.out.println("\nCoin Flip:");

        if (random.nextBoolean()) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }

        // =====================================================
        // Example 10 - Random Grades
        // =====================================================
        int marks = random.nextInt(0, 101);

        System.out.println("\nMarks: " + marks);

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        // =====================================================
        // Practice Challenge
        // =====================================================
        System.out.println("\nPractice Challenge:");
        System.out.println("Modify this program to:");
        System.out.println("1. Roll two dice and calculate their total.");
        System.out.println("2. Simulate 10 coin flips.");
        System.out.println("3. Generate lottery numbers.");
        System.out.println("4. Generate a random password.");
        System.out.println("5. Create a guessing game.");
    }
}
