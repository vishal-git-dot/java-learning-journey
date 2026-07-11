import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product;
        double price;
        int quantity;

        System.out.print("Enter product name: ");
        product = scanner.nextLine();

        System.out.print("Enter price: ");
        price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = scanner.nextInt();

        double subtotal = price * quantity;
        double discount = subtotal * 0.10;
        double finalTotal = subtotal - discount;

        System.out.println();
        System.out.println("----- BILL SUMMARY -----");
        System.out.println("Product    : " + product);
        System.out.println("Price      : $" + price);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Subtotal   : $" + subtotal);
        System.out.println("Discount   : $" + discount);
        System.out.println("Final Bill : $" + finalTotal);

        scanner.close();

    }

}
