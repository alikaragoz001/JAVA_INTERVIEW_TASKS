package week4_tasks;

import java.util.Arrays;

public class T2_String_Same_Letters {


    public static void main(String[] args) {

        String word1 = "bat";
        String word2 = "bat";

        System.out.println( sameLetters(word1, word2) ) ;

        String word3 = "hello";
        String word4 = "word";

        System.out.println(sameLetters(word3,word4));
    }

    public static boolean sameLetters(String word1, String word2) {
        /*
      String
     Same letters
     Write a return method that check if a string is build out of the
     same letters as another string.
     Ex:
     same(" abc ",","cab"); --> true
     same("abc abb "); -->  false
     */

        word1 = word1.toLowerCase().replaceAll(" ","");
        word2 = word2.toLowerCase().replaceAll(" ", "");

        // this checks if the strings are the same length
        if(word1.length() != word2.length()) {
            return false;
        }

        // this code converts string to char and sorts them
        char[] char1 = word1.toCharArray();
        char[] char2 = word2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);

        // checking if the sorted letters are equal
        return Arrays.equals(char1, char2);



    }
}