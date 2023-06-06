package week3_tasks;
/*
Numbers -- Prime Number
Write a method that can check if a number is prime or not.
 */
public class PrimeNumber {
        public static void main(String[] args) {
            int number = 17;
            boolean isPrime = isPrimeNumber(number);
            System.out.println(number + " is prime? " + isPrime);
        }

        // Method to check if a number is prime
        public static boolean isPrimeNumber(int number) {
            if (number <= 1) {
                return false;  // Numbers less than or equal to 1 are not prime
            }

            // Check divisibility from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;  // The number is divisible, hence not prime
                }
            }

            return true;  // The number is not divisible, hence prime
        }
    }



