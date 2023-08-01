package week5_tasks;

/*
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */

public class Zaid_1 {

    public static void main(String[] args) {

        String word = "DDDEEFFSMT";
        System.out.println(uniqueChar(word));

    }

    public static String uniqueChar(String word){


        String result ="";

        for (int i = 0; i < word.length(); i++) {

            char chr = word.charAt(i);
            if (word.indexOf(chr) == word.lastIndexOf(chr)){
                result += chr;
            }


        }
        return result;
    }


}
