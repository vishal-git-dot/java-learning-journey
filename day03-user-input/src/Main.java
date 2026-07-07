import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========== Student Information ==========");

        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println();
        System.out.println("========== Summary ==========");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("GPA        : " + gpa);
        System.out.println("Student    : " + isStudent);

        scanner.close();

    }

}
