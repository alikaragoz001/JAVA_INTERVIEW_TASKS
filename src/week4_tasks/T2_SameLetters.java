package week4_tasks;
/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */
import java.util.Arrays;

public class T2_SameLetters {
    public static boolean isSame(String str1, String str2) {
        // Convert both strings to lowercase for case-insensitive comparison
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Convert the strings to char arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Check if the sorted character arrays are equal
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args){
//     Example #1
        String str1 = "abc";
        String str2 = "cab";
        boolean result = isSame(str1, str2);
        System.out.println(result);  // Output: true

//     Example #2
        str1 = "abc";
        str2 = "abb";
        result = isSame(str1, str2);
        System.out.println(result);  // Output: false
    }
}
