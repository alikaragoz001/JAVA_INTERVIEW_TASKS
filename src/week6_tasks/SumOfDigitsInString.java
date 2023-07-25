package week6_tasks;
/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */
public class SumOfDigitsInString {
    public static void main(String[] args) {

        String input = "Cydeo2023B29";

        int sum = sumOfDigits(input);

        System.out.println("Sum of digits in the string: " + sum);
    }

    public static int sumOfDigits(String str) {

        int sum = 0; // Initialize a variable to store the sum of digits

        char[] charArray = str.toCharArray(); // Convert the input string into an array of characters

        for (char ch : charArray) {  // Iterate through each character in the string

            if (Character.isDigit(ch)) {  // Check if the character is a digit

                sum += Character.getNumericValue(ch); // Convert the character to an integer and add to the sum
            }
        }
        return sum;
    }
}

