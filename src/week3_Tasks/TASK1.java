package week3_Tasks;

public class TASK1 {
/*

1️⃣  Numbers -- Prime Number
Write a method that can check if a number is prime or not.
 */


    static boolean isPrime(int n){
        if(n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        if (isPrime(5)){
            System.out.println( " the number is Prime");
        }
        else {
            System.out.println(" the  number is  not prime");
        }
    }
}
