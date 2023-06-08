package week3_tasks;

public class ReverseNegativeNumber {
    public static int reverseNegativeNumber(int number) {
        if (number >= 0) {
            return number; // Return as-is if the number is not negative
        }

        String numberString = String.valueOf(number);
        StringBuilder reversedString = new StringBuilder(numberString.substring(1)).reverse();
        int reversedNumber = Integer.parseInt("-" + reversedString.toString());

        return reversedNumber;
    }
}

