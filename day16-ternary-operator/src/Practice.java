public class Practice {

    public static void main(String[] args) {

        // ==========================================
        // Practice 1
        // Adult or Minor
        // ==========================================

        int age = 16;

        String category = (age >= 18) ? "Adult" : "Minor";

        System.out.println(category);

        // ==========================================
        // Practice 2
        // Maximum Number
        // ==========================================

        int a = 25;
        int b = 40;

        int max = (a > b) ? a : b;

        System.out.println("Largest = " + max);

        // ==========================================
        // Practice 3
        // Battery Status
        // ==========================================

        int battery = 18;

        String status = (battery < 20)
                ? "Low Battery"
                : "Battery OK";

        System.out.println(status);

        // ==========================================
        // Practice 4
        // Weather
        // ==========================================

        int temperature = 34;

        String weather = (temperature > 30)
                ? "Hot"
                : "Cool";

        System.out.println(weather);

        // ==========================================
        // Practice 5
        // Member Discount
        // ==========================================

        boolean member = true;

        String discount = member
                ? "10% Discount"
                : "No Discount";

        System.out.println(discount);

        // ==========================================
        // Practice 6
        // Free Shipping
        // ==========================================

        double total = 82.50;

        String shipping = (total >= 50)
                ? "Free Shipping"
                : "Shipping Charges Apply";

        System.out.println(shipping);
    }
}
