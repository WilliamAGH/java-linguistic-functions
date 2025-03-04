/*
 * Description:
 * Lab 2 - Partner 18 group - A program to check if a string is a palindrome.
 * @Author William Callahan & Gabe Salinas-Carter
 * @since March 4, 2025
 */

import java.io.*;

public class Antics {
    public static boolean isPalindrome(String s) {

        // Convert string to lowercase and store as variable 's'
        s = s.toLowerCase();

        // Reverse the string character by character & store as variable 'rev'
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        return s.equals(rev);
        System.out.println("Hello, World!");
    }
}