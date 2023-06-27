package week4_tasks;

public class T2_SameLetters {
    public static boolean same (String str1, String str2 ) {

        //Check if the lenghts of the strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        //Create frequency arrays for both strings
        int[] frequency1 = new int[26];
        int[] frequency2 = new int[26];

        //Count the frequency of each letter in the first string
        for (char ch : str1.toCharArray()){
            frequency1 [ch - 'a']++;
        }

        //Count the frequency of each letter in he second string
        for (char ch: str2.toCharArray()) {
            frequency2 [ch - 'a']++;
        }


        //Compare the frequency arrays
        for (int i = 0; i < 26; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }

        }
                return true;

        }

    public static void main(String[] args) {
        System.out.println(same("abc", "cab")); // true
        System.out.println(same("abc", "abb")); //false

    }
}
