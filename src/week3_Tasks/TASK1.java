package week3_Tasks;

public class TASK1 {

    public static boolean isPrime(int number) {
        if (number < 2) {  // Numbers less than 2 are not prime
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 37;
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        // 37 is prime
    }


}
