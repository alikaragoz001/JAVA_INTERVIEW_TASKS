package wek5_tasks;

public class T2_Write_return_method_find_unique_char_String {


    /*
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */

        public static void main(String[] args) {

            String word = "AAABBBCCCDEF";
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
            return result;   // DEF
        }


    }

