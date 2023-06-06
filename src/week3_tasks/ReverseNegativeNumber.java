package week3_tasks;
/*
Numbers -- Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */

    public class ReverseNegativeNumber {
        public static void main(String[] args) {
            int number = -35;
            int reversedNumber = reverseNegativeNumber(number);
            System.out.println("Reversed number: " + reversedNumber);
        }

        // Method to reverse the digits of a negative number and return the result as an int
        public static int reverseNegativeNumber(int number) {
            boolean isNegative = number < 0;  // Check if the number is negative
            number = Math.abs(number);  // Convert the number to positive

            int reversedNumber = 0;
            while (number > 0) {
                int digit = number % 10;  // Extract the last digit of the number
                reversedNumber = reversedNumber * 10 + digit;  // Add the digit to the reversed number
                number /= 10;  // Remove the last digit from the number
            }

            // Apply the negative sign if the input number was originally negative
            return isNegative ? -reversedNumber : reversedNumber;
        }
    }




