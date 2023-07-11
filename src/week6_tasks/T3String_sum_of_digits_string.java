package week6_tasks;

public class T3String_sum_of_digits_string {


    public static int calculateDigitSum(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                sum += digit;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String input = "abc123xyz4566";
        int digitSum = calculateDigitSum(input);
        System.out.println("Sum of digits: " + digitSum); // Output: Sum of digits: 27
    }
}

/*
In this example, the calculateDigitSum method takes a string as input and iterates through each character in the string. If the character is a digit, it converts it to an integer using Character.getNumericValue() and adds it to the sum variable. Finally, the method returns the calculated sum.

        The main method demonstrates the usage of the calculateDigitSum method by passing a sample string ("abc123xyz456") and printing the resulting digit sum

 */