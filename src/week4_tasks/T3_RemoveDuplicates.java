package week4_tasks;

public class T3_RemoveDuplicates {
    /*
   String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC
    */

        public static String removeDup(String str) {

            String result = ""; // Initialize an empty string to store the result

            // Iterate through each character in the input string
            for (int i = 0; i < str.length(); i++) {

                // Get the current character
                char each = str.charAt(i);

                // Check if the result string does not already contain the current character
                if (!result.contains("" + each)) {

                    result += each;  // Append the current character to the result string
                }
            }

            return result; // Return the final result string without duplicates
        }

        public static void main(String[] args) {

            System.out.println(removeDup("AAABBBCCC"));
        }

    }



