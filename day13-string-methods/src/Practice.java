public class Practice {

    public static void main(String[] args) {

        /*
         * ==========================================
         * Example 1 : length()
         * ==========================================
         */
        String language = "Java";

        System.out.println(language.length());

        /*
         * ==========================================
         * Example 2 : charAt()
         * ==========================================
         */
        System.out.println(language.charAt(2));

        /*
         * ==========================================
         * Example 3 : indexOf()
         * ==========================================
         */
        System.out.println(language.indexOf('a'));

        /*
         * ==========================================
         * Example 4 : lastIndexOf()
         * ==========================================
         */
        String word = "Programming";

        System.out.println(word.lastIndexOf('m'));

        /*
         * ==========================================
         * Example 5 : toUpperCase()
         * ==========================================
         */
        System.out.println(language.toUpperCase());

        /*
         * ==========================================
         * Example 6 : toLowerCase()
         * ==========================================
         */
        System.out.println("HELLO".toLowerCase());

        /*
         * ==========================================
         * Example 7 : trim()
         * ==========================================
         */
        String text = "   Java   ";

        System.out.println(text.trim());

        /*
         * ==========================================
         * Example 8 : replace()
         * ==========================================
         */
        System.out.println(language.replace('a', '@'));

        /*
         * ==========================================
         * Example 9 : isEmpty()
         * ==========================================
         */
        String username = "";

        if (username.isEmpty()) {
            System.out.println("Username is empty.");
        }

        /*
         * ==========================================
         * Example 10 : contains()
         * ==========================================
         */
        String fullName = "John Smith";

        if (fullName.contains(" ")) {
            System.out.println("Contains a space.");
        }

        /*
         * ==========================================
         * Example 11 : equals()
         * ==========================================
         */
        System.out.println("Java".equals("Java"));

        /*
         * ==========================================
         * Example 12 : equalsIgnoreCase()
         * ==========================================
         */
        System.out.println("JAVA".equalsIgnoreCase("java"));

        /*
         * ==========================================
         * Example 13 : Simple Validation
         * ==========================================
         */
        String password = "Secret123";

        if (!password.isEmpty() && password.length() >= 8) {
            System.out.println("Valid password.");
        }

        /*
         * ==========================================
         * Example 14 : Username Validation
         * ==========================================
         */
        String user = "Developer01";

        if (!user.contains(" ")) {
            System.out.println("Username accepted.");
        }

        /*
         * ==========================================
         * Example 15 : Chaining Methods
         * ==========================================
         */
        String input = "   hello java   ";

        input = input.trim().toUpperCase();

        System.out.println(input);
    }
}
