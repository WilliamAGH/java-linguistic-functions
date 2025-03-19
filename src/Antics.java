import java.util.Scanner;

/**
 * Lab 2, Partner/Group 18
 * Description: This program checks for palindromes, abecedarian words,
 * pangrams, and capitalizes the first letter of a word
 * 
 * @author Gabe Salinas-Carter (isPangram, capitalizeFirstLetter)
 * @author William Callahan (isPalindrome, isAbecedarian)
 * @since 3/6/25
 */

public class Antics {

    /**
     * Determines if a string is a pangram (contains all 26 letters of the alphabet)
     * @param s The input string to check
     * @return True if the input string is a pangram, false otherwise
     */
    public static boolean isPangram(String s) {
        boolean[] mark = new boolean[26];
        int index;

        for (char cur : s.toCharArray()) {
            if (cur >= 'A' && cur <= 'Z') {
                index = cur - 'A';
            } else if (cur >= 'a' && cur <= 'z') {
                index = cur - 'a';
            } else {
                continue; 
            }
            mark[index] = true;
        }

        for (boolean letterPresent : mark) {
            if (!letterPresent) {
                return false;
            }
        }
        return true;
    }

    /**
     * Determines if a word is a palindrome (reads the same forward and backward)
     * @param s The input word to check
     * @return True if the word is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    /**
     * Determines if a word is abecedarian (letters appear in alphabetical order)
     * @param s The input word to check
     * @return True if the word is abecedarian, false otherwise
     */
    public static boolean isAbecedarian(String s) {
        String word = s.toLowerCase();
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Capitalizes the first letter of the given string
     * @param input The input string to capitalize
     * @return The string with the first letter capitalized
     */
    public static String capitalizeFirstLetter(String input) {
        if (Character.isLowerCase(input.charAt(0)))
            return input.substring(0, 1).toUpperCase() + input.substring(1);
        else
            return input;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter a word or sentence: ");
            String input = scanner.nextLine();

            while (true) {
                System.out.println("\nSelect an option:");
                System.out.println("1 - Check if it's a pangram");
                System.out.println("2 - Check if it's a palindrome");
                System.out.println("3 - Check if it's an abecedarian");
                System.out.println("4 - Capitalize the first letter");
                System.out.println("5 - Exit");
                System.out.print("Enter your choice (1-5): ");

                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        System.out.println("Pangram check: " + isPangram(input));
                        break;
                    case "2":
                        System.out.println("Palindrome check: " + isPalindrome(input));
                        break;
                    case "3":
                        System.out.println("Abecedarian check: " + isAbecedarian(input));
                        break;
                    case "4":
                        System.out.println("Capitalized: " + capitalizeFirstLetter(input));
                        break;
                    case "5":
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter 1-5.");
                }
            }
        }
    }
}
