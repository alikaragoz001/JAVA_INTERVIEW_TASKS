package week4;
/*
String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
public class T1_FrequencyOfChars {
        public static String getFrequency(String str) {
            String result = "";
            int[] count = new int[256]; // Assuming ASCII characters

            // Count the frequency of each character
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                count[ch]++;
            }

            // Build the frequency string
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    result += (char) i + "" + count[i];
                }
            }

            return result;
        }

        public static void main(String[] args) {
            String input = "AAABBCDD";
            String frequency = getFrequency(input);
            System.out.println("Frequency of characters: " + frequency);
        }
    }


