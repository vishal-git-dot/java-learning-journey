import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        String place;
        String animal;
        String action;
        String emotion;
        String food;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter a place: ");
        place = scanner.nextLine();

        System.out.print("Enter an animal: ");
        animal = scanner.nextLine();

        System.out.print("Enter a verb ending with -ing: ");
        action = scanner.nextLine();

        System.out.print("Enter an emotion: ");
        emotion = scanner.nextLine();

        System.out.print("Enter your favorite food: ");
        food = scanner.nextLine();

        System.out.println();
        System.out.println("============= PRACTICE STORY =============");
        System.out.println();

        System.out.println(name + " visited " + place + ".");
        System.out.println("There, a " + animal + " was " + action + ".");
        System.out.println("Everyone looked " + emotion + ".");
        System.out.println("After the adventure, everyone celebrated by eating " + food + ".");

        System.out.println();
        System.out.println("==========================================");

        scanner.close();
    }
}
