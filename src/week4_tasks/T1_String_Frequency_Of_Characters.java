package week4_tasks;

public class T1_String_Frequency_Of_Characters {


    public static void main(String[] args) {

        System.out.println("frequencyOfCharacters(\"aaabbbsssddd\") = " + frequencyOfCharacters("aaabbbsssddd"));

        // prints countOccurrences("aaabbbsssddd") = a3b3s3d3


    }





    public static String frequencyOfCharacters(String str) {
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            if (result.contains("" + ch)) {
                continue;
            }

            result += ch + "" + count;
        }

        return result;
    }

}


/*
1. String str = "aabcccd";

This line initializes a string variable named str with the value "aabcccd". This is the string for which we want to count the occurrences of each character.
2 .String result = "";

This line initializes an empty string variable named result. This variable will store the final result that shows each character along with its count.
3.for (int j = 0; j < str.length(); j++) {

This is an outer for loop that iterates over each character of the string str. It starts from index 0 and continues until the index is less than the length of the string (str.length()). The loop variable j represents the index of the current character.
4.char ch = str.charAt(j);

This line retrieves the character at index j from the string str and assigns it to the variable ch. This is the current character for which we want to count the occurrences.
5.int count = 0;

This line initializes an integer variable named count with the initial value 0. This variable will store the count of occurrences of the current character.
6.The inner for loop:

for (int i = 0; i < str.length(); i++) {
This inner loop iterates over each character of the string str again. It starts from index 0 and continues until the index is less than the length of the string (str.length()). The loop variable i represents the index of the current character.
if (str.charAt(i) == ch) {
This line checks if the character at index i in the string str is equal to the current character ch. If they match, it means the character has appeared in the string, so the count variable is incremented by 1.
7.if (result.contains("" + ch)) {

This line checks if the resulting string result already contains the current character ch. If it does, it means we have already added the character to the result, so we skip it and continue to the next iteration of the outer loop using the continue statement.
8.result += ch + "" + count;

This line concatenates the current character ch, the count of occurrences count, and an empty string ("") to convert the count to a string. The resulting string is then appended to the result string.
9.System.out.println(result);

Finally, the code prints the resulting string result, which shows each character along with its count.


 */

