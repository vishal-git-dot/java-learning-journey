import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ===============================
        // Example 1 - Full Name
        // ===============================

        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println();

        // ===============================
        // Example 2 - Integer Input
        // ===============================

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Clear input buffer
        scanner.nextLine();

        // ===============================
        // Example 3 - String After Integer
        // ===============================

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        // ===============================
        // Example 4 - Double Input
        // ===============================

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        // ===============================
        // Example 5 - Boolean Input
        // ===============================

        System.out.print("Are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println();
        System.out.println("========== Results ==========");
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
        System.out.println("Color     : " + color);
        System.out.println("GPA       : " + gpa);
        System.out.println("Student   : " + isStudent);

        // ===============================
        // Rectangle Area Calculator
        // ===============================

        System.out.println();
        System.out.println("===== Rectangle Area Calculator =====");

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        double area = width * height;

        System.out.println("Area = " + area + " cm²");

        scanner.close();

    }

}
