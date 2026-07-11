import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("===== Shopping Cart Program =====");

        System.out.print("What item would you like to buy? ");
        item = scanner.nextLine();

        System.out.print("What is the price for each? ");
        price = scanner.nextDouble();

        System.out.print("How many would you like? ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println();
        System.out.println("========== RECEIPT ==========");
        System.out.println("Item      : " + item);
        System.out.println("Price     : " + currency + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("-----------------------------");
        System.out.println("Total     : " + currency + total);
        System.out.println("=============================");

        scanner.close();

    }

}
