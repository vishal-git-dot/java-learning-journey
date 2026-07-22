public class Main {

    public static void main(String[] args) {

        String name = "Bro Code";

        // length()
        System.out.println("Length: " + name.length());

        // charAt()
        System.out.println("First Character: " + name.charAt(0));

        // indexOf()
        System.out.println("First 'o': " + name.indexOf('o'));

        // lastIndexOf()
        System.out.println("Last 'o': " + name.lastIndexOf('o'));

        // toUpperCase()
        System.out.println("Uppercase: " + name.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase: " + name.toLowerCase());

        // trim()
        String spaced = "   Java Programming   ";
        System.out.println("Trimmed: \"" + spaced.trim() + "\"");

        // replace()
        System.out.println("Replace: " + name.replace('o', 'a'));

        // isEmpty()
        String empty = "";
        System.out.println("Is Empty: " + empty.isEmpty());

        // contains()
        System.out.println("Contains Space: " + name.contains(" "));

        // equals()
        System.out.println("Equals 'Bro Code': " + name.equals("Bro Code"));

        // equalsIgnoreCase()
        System.out.println(
                "Equals Ignore Case: "
                        + name.equalsIgnoreCase("BRO CODE")
        );
    }
}
