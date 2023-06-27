package week4_tasks;

public class T1_FrequencyOfCharacters {
    public static String frequencyOfChars (String str ) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 1;
            while (i + 1 < str.length() && str.charAt(i + 1) == ch ) {
                count++;
                i++;
            }
            result.append(ch).append(count);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));
    }
}
