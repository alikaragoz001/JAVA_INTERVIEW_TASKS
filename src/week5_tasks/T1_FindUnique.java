package week5_tasks;

/*
   String -- Find the unique
   Write a return method that can find the unique characters from the String Ex: unique("AAABBBCCCDEF") ==> "DEF";
    */
public class T1_FindUnique {
    public static void main(String[] args) {

        String uniqueChars = findUnique("AAABBBCCCDEF");
        System.out.println("Unique characters: " + uniqueChars);
    }

    public static String findUnique(String str) {
        String uniqueChars = "";                        // creating an empty string to store the unique characters

        for (int i = 0; i < str.length(); i++) {        // iterating through each character in the input string
            char currentChar = str.charAt(i);

            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {   // checking if the current character is unique,
                // by comparing its first occurrence index
                // with its last occurrence index in the string
                uniqueChars += currentChar;              // if the character is unique, append it to the uniqueChars string
            }
        }
        return uniqueChars;
    }
}

