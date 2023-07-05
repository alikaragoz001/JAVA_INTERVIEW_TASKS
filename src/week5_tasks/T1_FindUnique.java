package week5_tasks;

public class T1_FindUnique {
    /*
    String -- Find the unique
    Write a return method that can find the unique characters from the String Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */

        public static void main(String[] args) {

            String uniqueChars = findUnique("AAABBBCCCDEF");
            System.out.println("Unique characters: " + uniqueChars);
        }

    public static String findUnique(String str) {
        String uniqueChars = "";    // Create an empty string to store the unique characters

        for (int i = 0; i < str.length(); i++) {  //   // Iterate through each character in the input string
            char currentChar = str.charAt(i);

            // Check if the current character is unique, by comparing its first occurrence index with its last occurrence index in the string

            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                uniqueChars += currentChar;   //    // If the character is unique, append it to the uniqueChars string
            }
        }

        return uniqueChars;
    }

}

