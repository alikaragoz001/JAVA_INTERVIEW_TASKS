package week4_tasks;

import java.util.Scanner;

/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
public class T1_FrequencyOfChar {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a String and a char");
            String str = input.next();
            char ch = input.next().charAt(0);

            int frequency = 0;

            for (int i = 0; i < str.length(); i++) {
                char eachchar = str.charAt(i);
                if (eachchar == ch) {
                    frequency++;

                }
            }
            System.out.println(frequency);

            input.close();
        }
}
