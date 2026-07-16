import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // ----------------------------------------
        // Create a Random object
        // ----------------------------------------
        Random random = new Random();

        // ----------------------------------------
        // Random integer between 1 and 6
        // ----------------------------------------
        int diceRoll = random.nextInt(1, 7);

        System.out.println("Dice Roll: " + diceRoll);

        // ----------------------------------------
        // Three random numbers between 1 and 100
        // ----------------------------------------
        int number1 = random.nextInt(1, 101);
        int number2 = random.nextInt(1, 101);
        int number3 = random.nextInt(1, 101);

        System.out.println("\nThree Random Numbers:");
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        // ----------------------------------------
        // Random double
        // ----------------------------------------
        double randomDecimal = random.nextDouble();

        System.out.println("\nRandom Double:");
        System.out.println(randomDecimal);

        // ----------------------------------------
        // Random boolean (Coin Flip)
        // ----------------------------------------
        boolean isHeads = random.nextBoolean();

        System.out.println("\nCoin Flip:");

        if (isHeads) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }
}
