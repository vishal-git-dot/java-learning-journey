import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if (email.contains("@")) {

            int atIndex = email.indexOf('@');

            username = email.substring(0, atIndex);
            domain = email.substring(atIndex + 1);

            System.out.println();
            System.out.println("===== Email Information =====");
            System.out.println("Username : " + username);
            System.out.println("Domain   : " + domain);

        } else {

            System.out.println();
            System.out.println("Invalid email.");
            System.out.println("Email must contain '@'.");
        }

        scanner.close();
    }
}
