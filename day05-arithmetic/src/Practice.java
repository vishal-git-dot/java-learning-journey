public class Practice {

    public static void main(String[] args) {

        int number = 10;

        System.out.println("Initial Value : " + number);

        number++;

        System.out.println("After ++ : " + number);

        number--;

        System.out.println("After -- : " + number);

        number += 15;

        System.out.println("After += 15 : " + number);

        number -= 5;

        System.out.println("After -= 5 : " + number);

        number *= 2;

        System.out.println("After *= 2 : " + number);

        number /= 4;

        System.out.println("After /= 4 : " + number);

        number %= 3;

        System.out.println("After %= 3 : " + number);

        System.out.println();

        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println("PEMDAS Result : " + result);

        System.out.println();

        int evenNumber = 24;

        if (evenNumber % 2 == 0) {
            System.out.println(evenNumber + " is Even");
        } else {
            System.out.println(evenNumber + " is Odd");
        }

    }

}
