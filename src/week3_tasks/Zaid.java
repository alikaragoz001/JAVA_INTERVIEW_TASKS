package week3_tasks;

public class Zaid {
    public static void main(String[] args) {
        if (isPrime(5)) {
            System.out.println(" the number is Prime");
        } else {
            System.out.println(" the number is not prime");
        }
    }

    // Numbers -- Prime Number
    // Write a method that can check if a number is prime or not.
    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;

    }
    }










