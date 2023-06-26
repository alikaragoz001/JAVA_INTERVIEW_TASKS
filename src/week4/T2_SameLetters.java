package week4;
/*
String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

 */
import java.util.Arrays;

public class T2_SameLetters {
    public static boolean same(String str1, String str2) {
        // Check if the lengths of the strings are different
        if (str1.length() != str2.length()) {
            return false; // Return false if lengths are different
        }

        // Convert both strings to lowercase for case-insensitive comparison
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Convert the strings to character arrays for easier manipulation
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Convert the sorted arrays back to strings
        String sortedStr1 = new String(arr1);
        String sortedStr2 = new String(arr2);

        // Compare the sorted strings for equality
        return sortedStr1.equals(sortedStr2);
    }

    public static void main(String[] args) {
        // Test the same method
        System.out.println(same("abc", "cab")); // true
        System.out.println(same("abc", "abb")); // false
    }
}


