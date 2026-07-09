import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective: ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun: ");
        noun1 = scanner.nextLine();

        System.out.print("Enter another adjective: ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb ending with -ing: ");
        verb1 = scanner.nextLine();

        System.out.print("Enter another adjective: ");
        adjective3 = scanner.nextLine();

        System.out.println();
        System.out.println("========== YOUR MAD LIBS STORY ==========");
        System.out.println();

        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit I saw a " + noun1 + ".");
        System.out.println("The " + noun1 + " was " + adjective2 + " and " + verb1 + ".");
        System.out.println("I was " + adjective3 + ".");

        System.out.println();
        System.out.println("=========================================");

        scanner.close();
    }
}
