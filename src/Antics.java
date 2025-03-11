import java.util.Scanner;

/**
 * Lab 2
 * Description: this program will convert the first character in a string from lower to upper case
 * @Author Gabe Salinas-Carter & William Callahan
 * @Since 3/6/25
 */

public class Antics {
    public static boolean isPangram(String s) {
        boolean[] mark = new boolean[26];
        boolean pangram = true;
        int index = 0;

        for (int i = 0; i < s.length(); i++) {

            char cur = s.charAt(i);

            if (cur >= 'A' && cur <= 'Z') {
                index = cur - 'A';
            } else if (cur >= 'a' && cur <= 'z') {
                index = cur - 'a';
            }

            mark[index] = true;
        }

        for (int i = 0; i < mark.length; i++) {
            if (mark[i] == false) {
                pangram = false;
            }
        }
        if (pangram) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter a pangram: ");
            String input = scanner.nextLine();

            if (isPangram(input)) {
                System.out.println("True");
                break;
            } else {
                System.out.println("False");
            }
        }
    }

    //Method to capitalize first letter in String
    public static String capitalizeFirstLetter(String input) {

        //checks to see if first character is lower case, returns upper case if so
        if (Character.isLowerCase(input.charAt(0)))
            return input.substring(0, 1).toUpperCase() + input.substring(1);
        else
            return ("The word you entered begins with an upper case letter please try again");
    }
}
