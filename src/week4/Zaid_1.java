package week4;

public class Zaid_1 {


    /*
     String
    Frequency of Characters
    Write a return method that can find the frequency of
    characters
    Ex:
    FrequencyOfChars ("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {


        System.out.println(frequencyFinder("aabcccd"));


    }

    public static String frequencyFinder(String wrd ) {


        String result = "";  //a2b1c3d1
                            // a b c d
                           //   2 1 3 1


        for (int j = 0; j < wrd.length(); j++) {

            char ch = wrd.charAt(j); //a
            int count = 0;
            for (int i = 0; i < wrd.length(); i++) {
                if (wrd.charAt(i) == ch) {
                    count++;
                }
            }

            if (result.contains("" + ch)) { // if the character is already included in the result
                continue; // skip that character
            }
            result += ch + "" + count;

        }
        return result;
    }


}
