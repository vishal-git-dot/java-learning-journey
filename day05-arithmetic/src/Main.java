public class Main {

    public static void main(String[] args) {

        int x = 10;
        int y = 3;

        System.out.println("Arithmetic Operators");
        System.out.println("--------------------");

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println();

        System.out.println("Addition       : " + (x + y));
        System.out.println("Subtraction    : " + (x - y));
        System.out.println("Multiplication : " + (x * y));
        System.out.println("Division       : " + (x / y));
        System.out.println("Modulus        : " + (x % y));

        System.out.println();

        x += y;
        System.out.println("After x += y : " + x);

        x -= y;
        System.out.println("After x -= y : " + x);

        x *= y;
        System.out.println("After x *= y : " + x);

        x /= y;
        System.out.println("After x /= y : " + x);

        x %= y;
        System.out.println("After x %= y : " + x);

        System.out.println();

        int count = 1;

        System.out.println("Increment Example");

        count++;
        System.out.println(count);

        count++;
        System.out.println(count);

        count++;

        System.out.println(count);

        System.out.println();

        System.out.println("Decrement Example");

        count--;

        System.out.println(count);

        count--;

        System.out.println(count);

    }

}
