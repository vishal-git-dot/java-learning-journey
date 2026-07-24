public class Practice {

    public static void main(String[] args) {

        // ==========================================
        // Example 1 - Beginning of String
        // ==========================================

        String language = "Programming";

        System.out.println(language.substring(0, 7));

        // ==========================================
        // Example 2 - End of String
        // ==========================================

        System.out.println(language.substring(3));

        // ==========================================
        // Example 3 - Middle of String
        // ==========================================

        System.out.println(language.substring(4, 8));

        // ==========================================
        // Example 4 - Username Extraction
        // ==========================================

        String email = "student@gmail.com";

        int atIndex = email.indexOf('@');

        String username = email.substring(0, atIndex);

        System.out.println(username);

        // ==========================================
        // Example 5 - Domain Extraction
        // ==========================================

        String domain = email.substring(atIndex + 1);

        System.out.println(domain);

        // ==========================================
        // Example 6 - Another Email
        // ==========================================

        email = "alex@yahoo.com";

        atIndex = email.indexOf('@');

        System.out.println(email.substring(0, atIndex));
        System.out.println(email.substring(atIndex + 1));

        // ==========================================
        // Example 7 - Extract File Extension
        // ==========================================

        String file = "document.pdf";

        int dotIndex = file.indexOf('.');

        String extension = file.substring(dotIndex + 1);

        System.out.println(extension);

        // ==========================================
        // Example 8 - Extract First Name
        // ==========================================

        String fullName = "John Smith";

        int spaceIndex = fullName.indexOf(' ');

        String firstName = fullName.substring(0, spaceIndex);

        System.out.println(firstName);

        // ==========================================
        // Example 9 - Extract Last Name
        // ==========================================

        String lastName = fullName.substring(spaceIndex + 1);

        System.out.println(lastName);

        // ==========================================
        // Example 10 - contains() Validation
        // ==========================================

        String input = "user@hotmail.com";

        if (input.contains("@")) {
            System.out.println("Valid email.");
        } else {
            System.out.println("Invalid email.");
        }

        // ==========================================
        // Example 11 - Multiple Substrings
        // ==========================================

        String text = "Java Programming";

        System.out.println(text.substring(0, 4));
        System.out.println(text.substring(5));
        System.out.println(text.substring(5, 11));

        // ==========================================
        // Example 12 - URL Parsing
        // ==========================================

        String url = "https://openai.com";

        int protocolEnd = url.indexOf(':');

        String protocol = url.substring(0, protocolEnd);

        System.out.println(protocol);

        // ==========================================
        // Example 13 - Practice Challenge
        // ==========================================

        String movie = "Avengers-Endgame";

        int dashIndex = movie.indexOf('-');

        String title = movie.substring(0, dashIndex);
        String subtitle = movie.substring(dashIndex + 1);

        System.out.println(title);
        System.out.println(subtitle);

        // ==========================================
        // End of Practice File
        // ==========================================
    }
}
